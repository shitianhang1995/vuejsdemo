new Vue({
    el: "#app",
    data: {
        user: {
            id: "",
            username: "",
            password: "",
            email: "",
            age: "",
            sex: ""
        },
        userList: []
    },
    methods: {
        findAll: function () {
            var _this = this;
            axios.get('/vuejs_war/user/findAll.do')
                .then(function (response) {
                    _this.userList = response.data;
                    console.log(response);
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        findById: function (userid) {
            var _this = this;
            axios.get('/vuejs_war/user/findById.do', {params: {id: userid}})
                .then(function (response) {
                    console.log(response);
                    _this.user = response.data;
                    $("#myModal").modal("show");

                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        update: function (user) {
            var _this = this;
            axios.post('/vuejs_war/user/updateUser.do', _this.user)
                .then(function (response) {
                    _this.findAll();
                    console.log(response);
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
    },
    created: function () {
        this.findAll();
    }
});
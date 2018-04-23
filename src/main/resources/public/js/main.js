var app = angular.module("kursova", []);

app.controller("AppCtrl", function ($scope, $http) {

    // $scope.deaneries = [];
    // $http.get('/api/deaneries').then(function (response) {
    //     $scope.deaneries = response.data;
    // });
    //
    // $scope.departments = [];
    // $http.get('/api/departments').then(function (response) {
    //     $scope.departments = response.data;
    // });
    //
    // $scope.chairs = [];
    // $http.get('/api/chairs').then(function (response) {
    //     $scope.chairs = response.data;
    //       // console.log(response);
    // });

    $scope.categoriesOfTeacher = [];
    $http.get('/api/categories of teacher').then(function (response) {
        $scope.categoriesOfTeacher = response.data;
    });

    // $scope.typesOfSubject = [];
    // $http.get('/api/types of subject').then(function (response) {
    //     $scope.typesOfSubject = response.data;
    // });
    //
    // $scope.formsOfControl = [];
    // $http.get('/api/forms of control').then(function (response) {
    //     $scope.formsOfControl = response.data;
    // });
    //
    // $scope.groups = [];
    // $http.get('/api/groups').then(function (response) {
    //     $scope.groups = response.data;
    // });
    //
    // $scope.students = [];
    // $http.get('/api/students').then(function (response) {
    //     $scope.students = response.data;
    // });
    //
    // $scope.diplomas = [];
    // $http.get('/api/diplomas').then(function (response) {
    //     $scope.diplomas = response.data;
    // });
    //
    // $scope.doctoralDissertations = [];
    // $http.get('/api/doctoral dissertations').then(function (response) {
    //     $scope.doctoralDissertations = response.data;
    //
    // });
    //
    // $scope.candidatesDissertations = [];
    // $http.get('/api/candidates dissertations').then(function (response) {
    //     $scope.candidatesDissertations = response.data;
    // });
    //
    // $scope.teachers = [];
    // $http.get('api/teachers').then(function (response) {
    //     $scope.teachers = response.data;
    // });
    //
    // $scope.subjects = [];
    // $http.get('api/subjects').then(function (response) {
    //     $scope.subjects = response.data;
    // });
    //
    // $scope.curriculum = [];
    // $http.get('api/curriculum').then(function (response) {
    //     $scope.curriculum = response.data;
    // });
    //
    // $scope.session = [];
    // $http.get('api/session').then(function (response) {
    //     $scope.session = response.data;
    // });

//-----------------------------------------------------------------------------

    this.delchair = function del(id) {
        $http.get('/api/category of teacher/del?id=' + id).then(function (response) {
            window.alert('Category of teacher:' + ' ' + response.data.name + ' ' + response.data.id + ' ' + response.data.abr + ' ' + ' has been succesfully deleted!');
            window.location.reload();
        });
    };


    this.insertCategoryOfTeacher = function () {
        var category = document.getElementById("category").value;
        var req = {
            method: 'POST',
            url: '/api/category of teacher/insert',
            data: {
                category: category
            }
        };
        console.log(req);
        $http(req).then(function (resp) {
            window.location.reload();
        })
    };

    this.updatechair = function () {
        var id = document.getElementById("id").value;
        var name = document.getElementById("name").value;
        var abr = document.getElementById("abr").value;
        var req = {
            method: 'POST',
            url: '/api/chair/update',
            data: {
                id: id,
                name: name,
                abr: abr
            }
        };
        // console.log(req);
        $http(req).then(function (resp) {

            window.location.reload();
        });

    };
});


(function () {
    'use strict';

    angular
        .module('offreContratFrontApp')
        .factory('Register', Register);

    Register.$inject = ['$resource'];

    function Register ($resource) {
        return $resource('api/register', {}, {});
    }
})();

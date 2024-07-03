const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootuaaa4/",
            name: "springbootuaaa4",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootuaaa4/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "多维分类的知识管理系统"
        } 
    }
}
export default base

webpackJsonp([17],{519:function(e,t,o){var s=o(198)(o(562),o(975),null,null);e.exports=s.exports},562:function(e,t,o){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.default={data:function(){return{options:[{value:"计算机",label:"计算机学院",children:[{value:"计算机科学与技术",label:"计算机科学与技术",children:[{value:"软件班",label:"软件班"},{value:"网络班",label:"网络班"}]}]}],form:{no:"",name:"",password:"",resource:"",desc:"",options:[]}}},mounted:function(){this.form.no=localStorage.getItem("sno")},methods:{onSubmit:function(){console.log(this.form),this.$message.success("提交成功！");var e=this;e.$axios.post("evaluation/student/update",this.form).then(function(t){t.data?(e.$router.push("/BaseTable"),e.$message.success("修改成功")):e.$message.success("修改成功")})}}}},975:function(e,t){e.exports={render:function(){var e=this,t=e.$createElement,o=e._self._c||t;return o("div",[o("div",{staticClass:"crumbs"},[o("el-breadcrumb",{attrs:{separator:"/"}},[o("el-breadcrumb-item",[o("i",{staticClass:"el-icon-date"}),e._v(" 信息")]),e._v(" "),o("el-breadcrumb-item",[e._v("修改信息")])],1)],1),e._v(" "),o("div",{staticClass:"container"},[o("div",{staticClass:"form-box"},[o("el-form",{ref:"form",attrs:{model:e.form,"label-width":"80px"}},[o("el-form-item",{attrs:{label:"学号"}},[o("el-input",{attrs:{disabled:"true"},model:{value:e.form.no,callback:function(t){e.$set(e.form,"no",t)},expression:"form.no"}})],1),e._v(" "),o("el-form-item",{attrs:{label:"姓名"}},[o("el-input",{model:{value:e.form.name,callback:function(t){e.$set(e.form,"name",t)},expression:"form.name"}})],1),e._v(" "),o("el-form-item",{attrs:{label:"性别"}},[o("el-radio-group",{model:{value:e.form.resource,callback:function(t){e.$set(e.form,"resource",t)},expression:"form.resource"}},[o("el-radio",{attrs:{label:"男"}}),e._v(" "),o("el-radio",{attrs:{label:"女"}})],1)],1),e._v(" "),o("el-form-item",{attrs:{label:"班级"}},[o("el-cascader",{attrs:{options:e.options},model:{value:e.form.options,callback:function(t){e.$set(e.form,"options",t)},expression:"form.options"}})],1),e._v(" "),o("el-form-item",{attrs:{label:"密码"}},[o("el-input",{model:{value:e.form.password,callback:function(t){e.$set(e.form,"password",t)},expression:"form.password"}})],1),e._v(" "),o("el-form-item",[o("el-button",{attrs:{type:"primary"},on:{click:e.onSubmit}},[e._v("表单提交")]),e._v(" "),o("el-button",[e._v("取消")])],1)],1)],1)])])},staticRenderFns:[]}}});
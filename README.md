# refactoring_step_by_step

1.在Driver类中设置变量age的权限为private
2.给外界访问age的getAge方法
3.修改Police中的checkDriver方法，driver通过getAge方法去访问私有Driver的私有变量age
public class c.b.q.s1 extends c.b.q.p1 implements c.b.q.q1 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static java.lang.reflect.Method K;
	 /* # instance fields */
	 public c.b.q.q1 J;
	 /* # direct methods */
	 public static c.b.q.s1 ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 try { // :try_start_0
			 /* const/16 v1, 0x1c */
			 /* if-gt v0, v1, :cond_0 */
			 /* .line 2 */
			 /* const-class v0, Landroid/widget/PopupWindow; */
			 final String v1 = "setTouchModal"; // const-string v1, "setTouchModal"
			 int v2 = 1; // const/4 v2, 0x1
			 /* new-array v2, v2, [Ljava/lang/Class; */
			 int v3 = 0; // const/4 v3, 0x0
			 v4 = java.lang.Boolean.TYPE;
			 /* aput-object v4, v2, v3 */
			 (( java.lang.Class ) v0 ).getDeclaredMethod ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 final String v0 = "MenuPopupWindow"; // const-string v0, "MenuPopupWindow"
			 final String v1 = "Could not find method setTouchModal() on PopupWindow.Oh well."; // const-string v1, "Could not find method setTouchModal() on PopupWindow.Oh well."
			 /* .line 3 */
			 android.util.Log .i ( v0,v1 );
		 } // :cond_0
	 } // :goto_0
	 return;
} // .end method
public c.b.q.s1 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0, p1, p2, p3, p4}, Lc/b/q/p1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
	 return;
} // .end method
/* # virtual methods */
public c.b.q.d1 a ( android.content.Context p0, Boolean p1 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* new-instance v0, Lc/b/q/r1; */
	 /* invoke-direct {v0, p1, p2}, Lc/b/q/r1;-><init>(Landroid/content/Context;Z)V */
	 /* .line 2 */
	 (( c.b.q.r1 ) v0 ).setHoverListener ( p0 ); // invoke-virtual {v0, p0}, Lc/b/q/r1;->setHoverListener(Lc/b/q/q1;)V
} // .end method
public void a ( Object p0, android.view.MenuItem p1 ) {
	 /* .locals 1 */
	 /* .line 6 */
	 v0 = this.J;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 7 */
	 } // :cond_0
	 return;
} // .end method
public void a ( c.b.q.q1 p0 ) {
	 /* .locals 0 */
	 /* .line 5 */
	 this.J = p1;
	 return;
} // .end method
public void a ( java.lang.Object p0 ) {
	 /* .locals 2 */
	 /* .line 3 */
	 /* const/16 v1, 0x17 */
	 /* if-lt v0, v1, :cond_0 */
	 /* .line 4 */
	 v0 = this.F;
	 /* check-cast p1, Landroid/transition/Transition; */
	 (( android.widget.PopupWindow ) v0 ).setEnterTransition ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setEnterTransition(Landroid/transition/Transition;)V
} // :cond_0
return;
} // .end method
public void b ( Object p0, android.view.MenuItem p1 ) {
/* .locals 1 */
/* .line 3 */
v0 = this.J;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 4 */
} // :cond_0
return;
} // .end method
public void b ( java.lang.Object p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
v0 = this.F;
/* check-cast p1, Landroid/transition/Transition; */
(( android.widget.PopupWindow ) v0 ).setExitTransition ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setExitTransition(Landroid/transition/Transition;)V
} // :cond_0
return;
} // .end method
public void d ( Boolean p0 ) {
/* .locals 4 */
/* .line 1 */
/* const/16 v1, 0x1c */
/* if-gt v0, v1, :cond_0 */
/* .line 2 */
v0 = c.b.q.s1.K;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
try { // :try_start_0
	 v1 = this.F;
	 int v2 = 1; // const/4 v2, 0x1
	 /* new-array v2, v2, [Ljava/lang/Object; */
	 int v3 = 0; // const/4 v3, 0x0
	 java.lang.Boolean .valueOf ( p1 );
	 /* aput-object p1, v2, v3 */
	 (( java.lang.reflect.Method ) v0 ).invoke ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 final String p1 = "MenuPopupWindow"; // const-string p1, "MenuPopupWindow"
	 final String v0 = "Could not invoke setTouchModal() on PopupWindow.Oh well."; // const-string v0, "Could not invoke setTouchModal() on PopupWindow.Oh well."
	 /* .line 4 */
	 android.util.Log .i ( p1,v0 );
	 /* .line 5 */
} // :cond_0
v0 = this.F;
(( android.widget.PopupWindow ) v0 ).setTouchModal ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setTouchModal(Z)V
} // :cond_1
} // :goto_0
return;
} // .end method

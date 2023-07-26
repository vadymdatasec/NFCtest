public abstract class c.b.q.v2 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.reflect.Method a;
	 /* # direct methods */
	 public static c.b.q.v2 ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 /* const/16 v1, 0x12 */
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 2 */
		 try { // :try_start_0
			 /* const-class v0, Landroid/view/View; */
			 final String v1 = "computeFitSystemWindows"; // const-string v1, "computeFitSystemWindows"
			 int v2 = 2; // const/4 v2, 0x2
			 /* new-array v2, v2, [Ljava/lang/Class; */
			 int v3 = 0; // const/4 v3, 0x0
			 /* const-class v4, Landroid/graphics/Rect; */
			 /* aput-object v4, v2, v3 */
			 /* const-class v3, Landroid/graphics/Rect; */
			 int v4 = 1; // const/4 v4, 0x1
			 /* aput-object v3, v2, v4 */
			 (( java.lang.Class ) v0 ).getDeclaredMethod ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 /* .line 3 */
			 v0 = 			 (( java.lang.reflect.Method ) v0 ).isAccessible ( ); // invoke-virtual {v0}, Ljava/lang/reflect/Method;->isAccessible()Z
			 /* if-nez v0, :cond_0 */
			 /* .line 4 */
			 v0 = c.b.q.v2.a;
			 (( java.lang.reflect.Method ) v0 ).setAccessible ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/reflect/Method;->setAccessible(Z)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 final String v0 = "ViewUtils"; // const-string v0, "ViewUtils"
			 final String v1 = "Could not find method computeFitSystemWindows.Oh well."; // const-string v1, "Could not find method computeFitSystemWindows.Oh well."
			 /* .line 5 */
			 android.util.Log .d ( v0,v1 );
		 } // :cond_0
	 } // :goto_0
	 return;
} // .end method
public static void a ( android.view.View p0, android.graphics.Rect p1, android.graphics.Rect p2 ) {
	 /* .locals 3 */
	 /* .line 2 */
	 v0 = c.b.q.v2.a;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v1 = 2; // const/4 v1, 0x2
		 try { // :try_start_0
			 /* new-array v1, v1, [Ljava/lang/Object; */
			 int v2 = 0; // const/4 v2, 0x0
			 /* aput-object p1, v1, v2 */
			 int p1 = 1; // const/4 p1, 0x1
			 /* aput-object p2, v1, p1 */
			 /* .line 3 */
			 (( java.lang.reflect.Method ) v0 ).invoke ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception p0 */
			 final String p1 = "ViewUtils"; // const-string p1, "ViewUtils"
			 final String p2 = "Could not invoke computeFitSystemWindows"; // const-string p2, "Could not invoke computeFitSystemWindows"
			 /* .line 4 */
			 android.util.Log .d ( p1,p2,p0 );
		 } // :cond_0
	 } // :goto_0
	 return;
} // .end method
public static Boolean a ( android.view.View p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 p0 = 	 c.h.n.v0 .o ( p0 );
	 int v0 = 1; // const/4 v0, 0x1
	 /* if-ne p0, v0, :cond_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public static void b ( android.view.View p0 ) {
/* .locals 6 */
final String v0 = "Could not invoke makeOptionalFitsSystemWindows"; // const-string v0, "Could not invoke makeOptionalFitsSystemWindows"
final String v1 = "ViewUtils"; // const-string v1, "ViewUtils"
/* .line 1 */
/* const/16 v3, 0x10 */
/* if-lt v2, v3, :cond_1 */
/* .line 2 */
try { // :try_start_0
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
final String v3 = "makeOptionalFitsSystemWindows"; // const-string v3, "makeOptionalFitsSystemWindows"
int v4 = 0; // const/4 v4, 0x0
/* new-array v5, v4, [Ljava/lang/Class; */
(( java.lang.Class ) v2 ).getMethod ( v3, v5 ); // invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 3 */
v3 = (( java.lang.reflect.Method ) v2 ).isAccessible ( ); // invoke-virtual {v2}, Ljava/lang/reflect/Method;->isAccessible()Z
/* if-nez v3, :cond_0 */
int v3 = 1; // const/4 v3, 0x1
/* .line 4 */
(( java.lang.reflect.Method ) v2 ).setAccessible ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/reflect/Method;->setAccessible(Z)V
} // :cond_0
/* new-array v3, v4, [Ljava/lang/Object; */
/* .line 5 */
(( java.lang.reflect.Method ) v2 ).invoke ( p0, v3 ); // invoke-virtual {v2, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
/* .line 6 */
android.util.Log .d ( v1,v0,p0 );
/* :catch_1 */
/* move-exception p0 */
/* .line 7 */
android.util.Log .d ( v1,v0,p0 );
/* :catch_2 */
final String p0 = "Could not find method makeOptionalFitsSystemWindows.Oh well..."; // const-string p0, "Could not find method makeOptionalFitsSystemWindows.Oh well..."
/* .line 8 */
android.util.Log .d ( v1,p0 );
} // :cond_1
} // :goto_0
return;
} // .end method

public abstract class c.v.b1 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static android.animation.LayoutTransition a;
	 public static java.lang.reflect.Field b;
	 public static Boolean c;
	 public static java.lang.reflect.Method d;
	 public static Boolean e;
	 /* # direct methods */
	 public static void a ( android.animation.LayoutTransition p0 ) {
		 /* .locals 7 */
		 /* .line 29 */
		 /* sget-boolean v0, Lc/v/b1;->e:Z */
		 final String v1 = "Failed to access cancel method by reflection"; // const-string v1, "Failed to access cancel method by reflection"
		 int v2 = 0; // const/4 v2, 0x0
		 final String v3 = "ViewGroupUtilsApi14"; // const-string v3, "ViewGroupUtilsApi14"
		 /* if-nez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 30 */
		 try { // :try_start_0
			 /* const-class v4, Landroid/animation/LayoutTransition; */
			 final String v5 = "cancel"; // const-string v5, "cancel"
			 /* new-array v6, v2, [Ljava/lang/Class; */
			 (( java.lang.Class ) v4 ).getDeclaredMethod ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 /* .line 31 */
			 (( java.lang.reflect.Method ) v4 ).setAccessible ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 32 */
			 /* :catch_0 */
			 android.util.Log .i ( v3,v1 );
			 /* .line 33 */
		 } // :goto_0
		 c.v.b1.e = (v0!= 0);
		 /* .line 34 */
	 } // :cond_0
	 v0 = c.v.b1.d;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 try { // :try_start_1
			 /* new-array v2, v2, [Ljava/lang/Object; */
			 /* .line 35 */
			 (( java.lang.reflect.Method ) v0 ).invoke ( p0, v2 ); // invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
			 /* :try_end_1 */
			 /* .catch Ljava/lang/IllegalAccessException; {:try_start_1 ..:try_end_1} :catch_2 */
			 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 ..:try_end_1} :catch_1 */
			 /* :catch_1 */
			 final String p0 = "Failed to invoke cancel method by reflection"; // const-string p0, "Failed to invoke cancel method by reflection"
			 /* .line 36 */
			 android.util.Log .i ( v3,p0 );
			 /* .line 37 */
			 /* :catch_2 */
			 android.util.Log .i ( v3,v1 );
		 } // :cond_1
	 } // :goto_1
	 return;
} // .end method
public static void a ( android.view.ViewGroup p0, Boolean p1 ) {
	 /* .locals 5 */
	 /* .line 1 */
	 v0 = c.v.b1.a;
	 int v1 = 1; // const/4 v1, 0x1
	 int v2 = 0; // const/4 v2, 0x0
	 int v3 = 0; // const/4 v3, 0x0
	 /* if-nez v0, :cond_0 */
	 /* .line 2 */
	 /* new-instance v0, Lc/v/a1; */
	 /* invoke-direct {v0}, Lc/v/a1;-><init>()V */
	 int v4 = 2; // const/4 v4, 0x2
	 /* .line 3 */
	 (( android.animation.LayoutTransition ) v0 ).setAnimator ( v4, v3 ); // invoke-virtual {v0, v4, v3}, Landroid/animation/LayoutTransition;->setAnimator(ILandroid/animation/Animator;)V
	 /* .line 4 */
	 v0 = c.v.b1.a;
	 (( android.animation.LayoutTransition ) v0 ).setAnimator ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/animation/LayoutTransition;->setAnimator(ILandroid/animation/Animator;)V
	 /* .line 5 */
	 v0 = c.v.b1.a;
	 (( android.animation.LayoutTransition ) v0 ).setAnimator ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Landroid/animation/LayoutTransition;->setAnimator(ILandroid/animation/Animator;)V
	 /* .line 6 */
	 v0 = c.v.b1.a;
	 int v4 = 3; // const/4 v4, 0x3
	 (( android.animation.LayoutTransition ) v0 ).setAnimator ( v4, v3 ); // invoke-virtual {v0, v4, v3}, Landroid/animation/LayoutTransition;->setAnimator(ILandroid/animation/Animator;)V
	 /* .line 7 */
	 v0 = c.v.b1.a;
	 int v4 = 4; // const/4 v4, 0x4
	 (( android.animation.LayoutTransition ) v0 ).setAnimator ( v4, v3 ); // invoke-virtual {v0, v4, v3}, Landroid/animation/LayoutTransition;->setAnimator(ILandroid/animation/Animator;)V
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_3
	 /* .line 8 */
	 (( android.view.ViewGroup ) p0 ).getLayoutTransition ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getLayoutTransition()Landroid/animation/LayoutTransition;
	 if ( p1 != null) { // if-eqz p1, :cond_2
		 /* .line 9 */
		 v0 = 		 (( android.animation.LayoutTransition ) p1 ).isRunning ( ); // invoke-virtual {p1}, Landroid/animation/LayoutTransition;->isRunning()Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 10 */
			 c.v.b1 .a ( p1 );
			 /* .line 11 */
		 } // :cond_1
		 v0 = c.v.b1.a;
		 /* if-eq p1, v0, :cond_2 */
		 /* .line 12 */
		 (( android.view.ViewGroup ) p0 ).setTag ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Landroid/view/ViewGroup;->setTag(ILjava/lang/Object;)V
		 /* .line 13 */
	 } // :cond_2
	 p1 = c.v.b1.a;
	 (( android.view.ViewGroup ) p0 ).setLayoutTransition ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setLayoutTransition(Landroid/animation/LayoutTransition;)V
	 /* .line 14 */
} // :cond_3
(( android.view.ViewGroup ) p0 ).setLayoutTransition ( v3 ); // invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->setLayoutTransition(Landroid/animation/LayoutTransition;)V
/* .line 15 */
/* sget-boolean p1, Lc/v/b1;->c:Z */
final String v0 = "ViewGroupUtilsApi14"; // const-string v0, "ViewGroupUtilsApi14"
/* if-nez p1, :cond_4 */
/* .line 16 */
try { // :try_start_0
	 /* const-class p1, Landroid/view/ViewGroup; */
	 final String v4 = "mLayoutSuppressed"; // const-string v4, "mLayoutSuppressed"
	 (( java.lang.Class ) p1 ).getDeclaredField ( v4 ); // invoke-virtual {p1, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
	 /* .line 17 */
	 (( java.lang.reflect.Field ) p1 ).setAccessible ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
	 /* :try_end_0 */
	 /* .catch Ljava/lang/NoSuchFieldException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 final String p1 = "Failed to access mLayoutSuppressed field by reflection"; // const-string p1, "Failed to access mLayoutSuppressed field by reflection"
	 /* .line 18 */
	 android.util.Log .i ( v0,p1 );
	 /* .line 19 */
} // :goto_0
c.v.b1.c = (v1!= 0);
/* .line 20 */
} // :cond_4
p1 = c.v.b1.b;
if ( p1 != null) { // if-eqz p1, :cond_6
/* .line 21 */
try { // :try_start_1
	 p1 = 	 (( java.lang.reflect.Field ) p1 ).getBoolean ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z
	 /* :try_end_1 */
	 /* .catch Ljava/lang/IllegalAccessException; {:try_start_1 ..:try_end_1} :catch_2 */
	 if ( p1 != null) { // if-eqz p1, :cond_5
		 /* .line 22 */
		 try { // :try_start_2
			 v1 = c.v.b1.b;
			 (( java.lang.reflect.Field ) v1 ).setBoolean ( p0, v2 ); // invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V
			 /* :try_end_2 */
			 /* .catch Ljava/lang/IllegalAccessException; {:try_start_2 ..:try_end_2} :catch_1 */
			 /* :catch_1 */
			 /* move v2, p1 */
		 } // :cond_5
	 } // :goto_1
	 /* move v2, p1 */
	 /* :catch_2 */
} // :goto_2
final String p1 = "Failed to get mLayoutSuppressed field by reflection"; // const-string p1, "Failed to get mLayoutSuppressed field by reflection"
/* .line 23 */
android.util.Log .i ( v0,p1 );
} // :cond_6
} // :goto_3
if ( v2 != null) { // if-eqz v2, :cond_7
/* .line 24 */
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
/* .line 25 */
} // :cond_7
/* .line 26 */
(( android.view.ViewGroup ) p0 ).getTag ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getTag(I)Ljava/lang/Object;
/* check-cast p1, Landroid/animation/LayoutTransition; */
if ( p1 != null) { // if-eqz p1, :cond_8
/* .line 27 */
(( android.view.ViewGroup ) p0 ).setTag ( v0, v3 ); // invoke-virtual {p0, v0, v3}, Landroid/view/ViewGroup;->setTag(ILjava/lang/Object;)V
/* .line 28 */
(( android.view.ViewGroup ) p0 ).setLayoutTransition ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setLayoutTransition(Landroid/animation/LayoutTransition;)V
} // :cond_8
} // :goto_4
return;
} // .end method

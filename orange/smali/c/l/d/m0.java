public abstract class c.l.d.m0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( Integer p0, Boolean p1 ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x1001 */
		 /* if-eq p0, v0, :cond_4 */
		 /* const/16 v0, 0x1003 */
		 /* if-eq p0, v0, :cond_2 */
		 /* const/16 v0, 0x2002 */
		 /* if-eq p0, v0, :cond_0 */
		 int p0 = -1; // const/4 p0, -0x1
	 } // :cond_0
	 if ( p1 != null) { // if-eqz p1, :cond_1
		 /* .line 43 */
	 } // :cond_1
} // :cond_2
if ( p1 != null) { // if-eqz p1, :cond_3
	 /* .line 44 */
} // :cond_3
} // :cond_4
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 45 */
} // :cond_5
} // :goto_0
} // .end method
public static Integer a ( androidx.fragment.app.Fragment p0, Boolean p1, Boolean p2 ) {
/* .locals 0 */
if ( p2 != null) { // if-eqz p2, :cond_1
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 23 */
p0 = (( androidx.fragment.app.Fragment ) p0 ).B ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()I
/* .line 24 */
} // :cond_0
p0 = (( androidx.fragment.app.Fragment ) p0 ).C ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()I
} // :cond_1
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 25 */
p0 = (( androidx.fragment.app.Fragment ) p0 ).n ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n()I
/* .line 26 */
} // :cond_2
p0 = (( androidx.fragment.app.Fragment ) p0 ).q ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q()I
} // .end method
public static c.l.d.k0 a ( android.content.Context p0, androidx.fragment.app.Fragment p1, Boolean p2, Boolean p3 ) {
/* .locals 5 */
/* .line 1 */
v0 = (( androidx.fragment.app.Fragment ) p1 ).x ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->x()I
/* .line 2 */
p3 = c.l.d.m0 .a ( p1,p2,p3 );
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
(( androidx.fragment.app.Fragment ) p1 ).a ( v1, v1, v1, v1 ); // invoke-virtual {p1, v1, v1, v1, v1}, Landroidx/fragment/app/Fragment;->a(IIII)V
/* .line 4 */
v2 = this.H;
int v3 = 0; // const/4 v3, 0x0
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 5 */
(( android.view.ViewGroup ) v2 ).getTag ( v4 ); // invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->getTag(I)Ljava/lang/Object;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 6 */
v2 = this.H;
(( android.view.ViewGroup ) v2 ).setTag ( v4, v3 ); // invoke-virtual {v2, v4, v3}, Landroid/view/ViewGroup;->setTag(ILjava/lang/Object;)V
/* .line 7 */
} // :cond_0
v2 = this.H;
if ( v2 != null) { // if-eqz v2, :cond_1
(( android.view.ViewGroup ) v2 ).getLayoutTransition ( ); // invoke-virtual {v2}, Landroid/view/ViewGroup;->getLayoutTransition()Landroid/animation/LayoutTransition;
if ( v2 != null) { // if-eqz v2, :cond_1
	 /* .line 8 */
} // :cond_1
(( androidx.fragment.app.Fragment ) p1 ).a ( v0, p2, p3 ); // invoke-virtual {p1, v0, p2, p3}, Landroidx/fragment/app/Fragment;->a(IZI)Landroid/view/animation/Animation;
if ( v2 != null) { // if-eqz v2, :cond_2
	 /* .line 9 */
	 /* new-instance p0, Lc/l/d/k0; */
	 /* invoke-direct {p0, v2}, Lc/l/d/k0;-><init>(Landroid/view/animation/Animation;)V */
	 /* .line 10 */
} // :cond_2
(( androidx.fragment.app.Fragment ) p1 ).b ( v0, p2, p3 ); // invoke-virtual {p1, v0, p2, p3}, Landroidx/fragment/app/Fragment;->b(IZI)Landroid/animation/Animator;
if ( p1 != null) { // if-eqz p1, :cond_3
	 /* .line 11 */
	 /* new-instance p0, Lc/l/d/k0; */
	 /* invoke-direct {p0, p1}, Lc/l/d/k0;-><init>(Landroid/animation/Animator;)V */
} // :cond_3
/* if-nez p3, :cond_4 */
if ( v0 != null) { // if-eqz v0, :cond_4
	 /* .line 12 */
	 p3 = 	 c.l.d.m0 .a ( v0,p2 );
} // :cond_4
if ( p3 != null) { // if-eqz p3, :cond_8
	 /* .line 13 */
	 (( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) p1 ).getResourceTypeName ( p3 ); // invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;
	 final String p2 = "anim"; // const-string p2, "anim"
	 /* .line 14 */
	 p1 = 	 (( java.lang.String ) p2 ).equals ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( p1 != null) { // if-eqz p1, :cond_6
		 /* .line 15 */
		 try { // :try_start_0
			 android.view.animation.AnimationUtils .loadAnimation ( p0,p3 );
			 if ( p2 != null) { // if-eqz p2, :cond_5
				 /* .line 16 */
				 /* new-instance v0, Lc/l/d/k0; */
				 /* invoke-direct {v0, p2}, Lc/l/d/k0;-><init>(Landroid/view/animation/Animation;)V */
				 /* :try_end_0 */
				 /* .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 ..:try_end_0} :catch_1 */
				 /* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
			 } // :cond_5
			 int v1 = 1; // const/4 v1, 0x1
			 /* :catch_0 */
			 /* nop */
			 /* :catch_1 */
			 /* move-exception p0 */
			 /* .line 17 */
			 /* throw p0 */
		 } // :cond_6
	 } // :goto_0
	 /* if-nez v1, :cond_8 */
	 /* .line 18 */
	 try { // :try_start_1
		 android.animation.AnimatorInflater .loadAnimator ( p0,p3 );
		 if ( p2 != null) { // if-eqz p2, :cond_8
			 /* .line 19 */
			 /* new-instance v0, Lc/l/d/k0; */
			 /* invoke-direct {v0, p2}, Lc/l/d/k0;-><init>(Landroid/animation/Animator;)V */
			 /* :try_end_1 */
			 /* .catch Ljava/lang/RuntimeException; {:try_start_1 ..:try_end_1} :catch_2 */
			 /* :catch_2 */
			 /* move-exception p2 */
			 /* if-nez p1, :cond_7 */
			 /* .line 20 */
			 android.view.animation.AnimationUtils .loadAnimation ( p0,p3 );
			 if ( p0 != null) { // if-eqz p0, :cond_8
				 /* .line 21 */
				 /* new-instance p1, Lc/l/d/k0; */
				 /* invoke-direct {p1, p0}, Lc/l/d/k0;-><init>(Landroid/view/animation/Animation;)V */
				 /* .line 22 */
			 } // :cond_7
			 /* throw p2 */
		 } // :cond_8
	 } // .end method
	 public static void a ( androidx.fragment.app.Fragment p0, c.l.d.k0 p1, c.l.d.l2 p2 ) {
		 /* .locals 7 */
		 /* .line 27 */
		 v2 = this.I;
		 /* .line 28 */
		 v1 = this.H;
		 /* .line 29 */
		 (( android.view.ViewGroup ) v1 ).startViewTransition ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V
		 /* .line 30 */
		 /* new-instance v5, Lc/h/j/c; */
		 /* invoke-direct {v5}, Lc/h/j/c;-><init>()V */
		 /* .line 31 */
		 /* new-instance v0, Lc/l/d/g0; */
		 /* invoke-direct {v0, p0}, Lc/l/d/g0;-><init>(Landroidx/fragment/app/Fragment;)V */
		 (( c.h.j.c ) v5 ).a ( v0 ); // invoke-virtual {v5, v0}, Lc/h/j/c;->a(Lc/h/j/b;)V
		 /* .line 32 */
		 /* .line 33 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 34 */
			 /* new-instance v0, Lc/l/d/l0; */
			 p1 = this.a;
			 /* invoke-direct {v0, p1, v1, v2}, Lc/l/d/l0;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V */
			 /* .line 35 */
			 p1 = this.I;
			 (( androidx.fragment.app.Fragment ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->a(Landroid/view/View;)V
			 /* .line 36 */
			 /* new-instance p1, Lc/l/d/i0; */
			 /* invoke-direct {p1, v1, p0, p2, v5}, Lc/l/d/i0;-><init>(Landroid/view/ViewGroup;Landroidx/fragment/app/Fragment;Lc/l/d/l2;Lc/h/j/c;)V */
			 (( android.view.animation.Animation ) v0 ).setAnimationListener ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
			 /* .line 37 */
			 p0 = this.I;
			 (( android.view.View ) p0 ).startAnimation ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
			 /* .line 38 */
		 } // :cond_0
		 p1 = this.b;
		 /* .line 39 */
		 (( androidx.fragment.app.Fragment ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->a(Landroid/animation/Animator;)V
		 /* .line 40 */
		 /* new-instance v6, Lc/l/d/j0; */
		 /* move-object v0, v6 */
		 /* move-object v3, p0 */
		 /* move-object v4, p2 */
		 /* invoke-direct/range {v0 ..v5}, Lc/l/d/j0;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroidx/fragment/app/Fragment;Lc/l/d/l2;Lc/h/j/c;)V */
		 (( android.animation.Animator ) p1 ).addListener ( v6 ); // invoke-virtual {p1, v6}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V
		 /* .line 41 */
		 p0 = this.I;
		 (( android.animation.Animator ) p1 ).setTarget ( p0 ); // invoke-virtual {p1, p0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V
		 /* .line 42 */
		 (( android.animation.Animator ) p1 ).start ( ); // invoke-virtual {p1}, Landroid/animation/Animator;->start()V
	 } // :goto_0
	 return;
} // .end method

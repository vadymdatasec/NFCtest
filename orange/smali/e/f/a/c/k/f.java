public abstract class e.f.a.c.k.f {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final a;
	 /* # direct methods */
	 public static e.f.a.c.k.f ( ) {
		 /* .locals 3 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [I */
		 int v1 = 0; // const/4 v1, 0x0
		 /* const v2, 0x1010448 */
		 /* aput v2, v0, v1 */
		 /* .line 1 */
		 return;
	 } // .end method
	 public static void a ( android.view.View p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = android.view.ViewOutlineProvider.BOUNDS;
		 (( android.view.View ) p0 ).setOutlineProvider ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V
		 return;
	 } // .end method
	 public static void a ( android.view.View p0, Float p1 ) {
		 /* .locals 11 */
		 /* .line 9 */
		 (( android.view.View ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;
		 v0 = 		 (( android.content.res.Resources ) v0 ).getInteger ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I
		 /* .line 10 */
		 /* new-instance v1, Landroid/animation/StateListAnimator; */
		 /* invoke-direct {v1}, Landroid/animation/StateListAnimator;-><init>()V */
		 int v2 = 3; // const/4 v2, 0x3
		 /* new-array v2, v2, [I */
		 /* const v3, 0x101000e */
		 int v4 = 0; // const/4 v4, 0x0
		 /* aput v3, v2, v4 */
		 /* .line 11 */
		 int v6 = 1; // const/4 v6, 0x1
		 /* aput v5, v2, v6 */
		 /* neg-int v5, v5 */
		 int v7 = 2; // const/4 v7, 0x2
		 /* aput v5, v2, v7 */
		 /* new-array v5, v6, [F */
		 int v7 = 0; // const/4 v7, 0x0
		 /* aput v7, v5, v4 */
		 final String v8 = "elevation"; // const-string v8, "elevation"
		 /* .line 12 */
		 android.animation.ObjectAnimator .ofFloat ( p0,v8,v5 );
		 /* int-to-long v9, v0 */
		 (( android.animation.ObjectAnimator ) v5 ).setDuration ( v9, v10 ); // invoke-virtual {v5, v9, v10}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;
		 /* .line 13 */
		 (( android.animation.StateListAnimator ) v1 ).addState ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/animation/StateListAnimator;->addState([ILandroid/animation/Animator;)V
		 /* new-array v0, v6, [I */
		 /* aput v3, v0, v4 */
		 /* new-array v2, v6, [F */
		 /* aput p1, v2, v4 */
		 /* .line 14 */
		 android.animation.ObjectAnimator .ofFloat ( p0,v8,v2 );
		 (( android.animation.ObjectAnimator ) p1 ).setDuration ( v9, v10 ); // invoke-virtual {p1, v9, v10}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;
		 /* .line 15 */
		 (( android.animation.StateListAnimator ) v1 ).addState ( v0, p1 ); // invoke-virtual {v1, v0, p1}, Landroid/animation/StateListAnimator;->addState([ILandroid/animation/Animator;)V
		 /* new-array p1, v4, [I */
		 /* new-array v0, v6, [F */
		 /* aput v7, v0, v4 */
		 /* .line 16 */
		 android.animation.ObjectAnimator .ofFloat ( p0,v8,v0 );
		 /* const-wide/16 v2, 0x0 */
		 (( android.animation.ObjectAnimator ) v0 ).setDuration ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;
		 (( android.animation.StateListAnimator ) v1 ).addState ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Landroid/animation/StateListAnimator;->addState([ILandroid/animation/Animator;)V
		 /* .line 17 */
		 (( android.view.View ) p0 ).setStateListAnimator ( v1 ); // invoke-virtual {p0, v1}, Landroid/view/View;->setStateListAnimator(Landroid/animation/StateListAnimator;)V
		 return;
	 } // .end method
	 public static void a ( android.view.View p0, android.util.AttributeSet p1, Integer p2, Integer p3 ) {
		 /* .locals 8 */
		 /* .line 2 */
		 (( android.view.View ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;
		 /* .line 3 */
		 v2 = e.f.a.c.k.f.a;
		 int v7 = 0; // const/4 v7, 0x0
		 /* new-array v5, v7, [I */
		 /* move-object v0, v6 */
		 /* move-object v1, p1 */
		 /* move v3, p2 */
		 /* move v4, p3 */
		 /* .line 4 */
		 /* invoke-static/range {v0 ..v5}, Le/f/a/c/p/c;->c(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray; */
		 /* .line 5 */
		 try { // :try_start_0
			 p2 = 			 (( android.content.res.TypedArray ) p1 ).hasValue ( v7 ); // invoke-virtual {p1, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z
			 if ( p2 != null) { // if-eqz p2, :cond_0
				 /* .line 6 */
				 p2 = 				 (( android.content.res.TypedArray ) p1 ).getResourceId ( v7, v7 ); // invoke-virtual {p1, v7, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I
				 android.animation.AnimatorInflater .loadStateListAnimator ( v6,p2 );
				 /* .line 7 */
				 (( android.view.View ) p0 ).setStateListAnimator ( p2 ); // invoke-virtual {p0, p2}, Landroid/view/View;->setStateListAnimator(Landroid/animation/StateListAnimator;)V
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* .line 8 */
			 } // :cond_0
			 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
			 return;
			 /* :catchall_0 */
			 /* move-exception p0 */
			 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
			 /* throw p0 */
		 } // .end method

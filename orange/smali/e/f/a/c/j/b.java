public abstract class e.f.a.c.j.b {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static void a ( android.animation.AnimatorSet p0, java.util.List p1 ) {
		 /* .locals 10 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Landroid/animation/AnimatorSet;", */
		 /* "Ljava/util/List<", */
		 /* "Landroid/animation/Animator;", */
		 /* ">;)V" */
		 /* } */
	 } // .end annotation
	 v0 = 	 /* .line 1 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* const-wide/16 v2, 0x0 */
	 int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v4, v0, :cond_0 */
/* .line 2 */
/* check-cast v5, Landroid/animation/Animator; */
/* .line 3 */
(( android.animation.Animator ) v5 ).getStartDelay ( ); // invoke-virtual {v5}, Landroid/animation/Animator;->getStartDelay()J
/* move-result-wide v6 */
(( android.animation.Animator ) v5 ).getDuration ( ); // invoke-virtual {v5}, Landroid/animation/Animator;->getDuration()J
/* move-result-wide v8 */
/* add-long/2addr v6, v8 */
java.lang.Math .max ( v2,v3,v6,v7 );
/* move-result-wide v2 */
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_0
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [I */
/* .line 4 */
/* fill-array-data v0, :array_0 */
android.animation.ValueAnimator .ofInt ( v0 );
/* .line 5 */
(( android.animation.Animator ) v0 ).setDuration ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;
/* .line 6 */
/* .line 7 */
(( android.animation.AnimatorSet ) p0 ).playTogether ( p1 ); // invoke-virtual {p0, p1}, Landroid/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V
return;
/* :array_0 */
/* .array-data 4 */
/* 0x0 */
/* 0x0 */
} // .end array-data
} // .end method

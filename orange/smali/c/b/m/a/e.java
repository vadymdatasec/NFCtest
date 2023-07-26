public class c.b.m.a.e extends c.b.m.a.g {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.animation.ObjectAnimator a;
	 public final Boolean b;
	 /* # direct methods */
	 public c.b.m.a.e ( ) {
		 /* .locals 5 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 /* invoke-direct {p0, v0}, Lc/b/m/a/g;-><init>(Lc/b/m/a/a;)V */
		 /* .line 2 */
		 v0 = 		 (( android.graphics.drawable.AnimationDrawable ) p1 ).getNumberOfFrames ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/AnimationDrawable;->getNumberOfFrames()I
		 int v1 = 0; // const/4 v1, 0x0
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* add-int/lit8 v2, v0, -0x1 */
		 } // :cond_0
		 int v2 = 0; // const/4 v2, 0x0
	 } // :goto_0
	 int v3 = 1; // const/4 v3, 0x1
	 if ( p2 != null) { // if-eqz p2, :cond_1
		 int v0 = 0; // const/4 v0, 0x0
	 } // :cond_1
	 /* sub-int/2addr v0, v3 */
	 /* .line 3 */
} // :goto_1
/* new-instance v4, Lc/b/m/a/f; */
/* invoke-direct {v4, p1, p2}, Lc/b/m/a/f;-><init>(Landroid/graphics/drawable/AnimationDrawable;Z)V */
int p2 = 2; // const/4 p2, 0x2
/* new-array p2, p2, [I */
/* aput v2, p2, v1 */
/* aput v0, p2, v3 */
final String v0 = "currentIndex"; // const-string v0, "currentIndex"
/* .line 4 */
android.animation.ObjectAnimator .ofInt ( p1,v0,p2 );
/* .line 5 */
/* const/16 v0, 0x12 */
/* if-lt p2, v0, :cond_2 */
/* .line 6 */
(( android.animation.ObjectAnimator ) p1 ).setAutoCancel ( v3 ); // invoke-virtual {p1, v3}, Landroid/animation/ObjectAnimator;->setAutoCancel(Z)V
/* .line 7 */
} // :cond_2
p2 = (( c.b.m.a.f ) v4 ).a ( ); // invoke-virtual {v4}, Lc/b/m/a/f;->a()I
/* int-to-long v0, p2 */
(( android.animation.ObjectAnimator ) p1 ).setDuration ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;
/* .line 8 */
(( android.animation.ObjectAnimator ) p1 ).setInterpolator ( v4 ); // invoke-virtual {p1, v4}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V
/* .line 9 */
/* iput-boolean p3, p0, Lc/b/m/a/e;->b:Z */
/* .line 10 */
this.a = p1;
return;
} // .end method
/* # virtual methods */
public Boolean a ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/m/a/e;->b:Z */
} // .end method
public void b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( android.animation.ObjectAnimator ) v0 ).reverse ( ); // invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->reverse()V
return;
} // .end method
public void c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( android.animation.ObjectAnimator ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V
return;
} // .end method
public void d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( android.animation.ObjectAnimator ) v0 ).cancel ( ); // invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V
return;
} // .end method

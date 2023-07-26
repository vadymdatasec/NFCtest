public class e.f.a.c.j.e {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Long a;
	 public Long b;
	 public android.animation.TimeInterpolator c;
	 public Integer d;
	 public Integer e;
	 /* # direct methods */
	 public e.f.a.c.j.e ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const-wide/16 v0, 0x0 */
		 /* .line 2 */
		 /* iput-wide v0, p0, Le/f/a/c/j/e;->a:J */
		 /* const-wide/16 v0, 0x12c */
		 /* .line 3 */
		 /* iput-wide v0, p0, Le/f/a/c/j/e;->b:J */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 4 */
		 this.c = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 5 */
		 /* iput v0, p0, Le/f/a/c/j/e;->d:I */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 6 */
		 /* iput v0, p0, Le/f/a/c/j/e;->e:I */
		 /* .line 7 */
		 /* iput-wide p1, p0, Le/f/a/c/j/e;->a:J */
		 /* .line 8 */
		 /* iput-wide p3, p0, Le/f/a/c/j/e;->b:J */
		 return;
	 } // .end method
	 public e.f.a.c.j.e ( ) {
		 /* .locals 2 */
		 /* .line 9 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const-wide/16 v0, 0x0 */
		 /* .line 10 */
		 /* iput-wide v0, p0, Le/f/a/c/j/e;->a:J */
		 /* const-wide/16 v0, 0x12c */
		 /* .line 11 */
		 /* iput-wide v0, p0, Le/f/a/c/j/e;->b:J */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 12 */
		 this.c = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 13 */
		 /* iput v0, p0, Le/f/a/c/j/e;->d:I */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 14 */
		 /* iput v0, p0, Le/f/a/c/j/e;->e:I */
		 /* .line 15 */
		 /* iput-wide p1, p0, Le/f/a/c/j/e;->a:J */
		 /* .line 16 */
		 /* iput-wide p3, p0, Le/f/a/c/j/e;->b:J */
		 /* .line 17 */
		 this.c = p5;
		 return;
	 } // .end method
	 public static e.f.a.c.j.e a ( android.animation.ValueAnimator p0 ) {
		 /* .locals 7 */
		 /* .line 8 */
		 /* new-instance v6, Le/f/a/c/j/e; */
		 /* .line 9 */
		 (( android.animation.ValueAnimator ) p0 ).getStartDelay ( ); // invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getStartDelay()J
		 /* move-result-wide v1 */
		 (( android.animation.ValueAnimator ) p0 ).getDuration ( ); // invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getDuration()J
		 /* move-result-wide v3 */
		 e.f.a.c.j.e .b ( p0 );
		 /* move-object v0, v6 */
		 /* invoke-direct/range {v0 ..v5}, Le/f/a/c/j/e;-><init>(JJLandroid/animation/TimeInterpolator;)V */
		 /* .line 10 */
		 v0 = 		 (( android.animation.ValueAnimator ) p0 ).getRepeatCount ( ); // invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getRepeatCount()I
		 /* iput v0, v6, Le/f/a/c/j/e;->d:I */
		 /* .line 11 */
		 p0 = 		 (( android.animation.ValueAnimator ) p0 ).getRepeatMode ( ); // invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getRepeatMode()I
		 /* iput p0, v6, Le/f/a/c/j/e;->e:I */
	 } // .end method
	 public static android.animation.TimeInterpolator b ( android.animation.ValueAnimator p0 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 (( android.animation.ValueAnimator ) p0 ).getInterpolator ( ); // invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getInterpolator()Landroid/animation/TimeInterpolator;
		 /* .line 3 */
		 /* instance-of v0, p0, Landroid/view/animation/AccelerateDecelerateInterpolator; */
		 /* if-nez v0, :cond_3 */
		 /* if-nez p0, :cond_0 */
		 /* .line 4 */
	 } // :cond_0
	 /* instance-of v0, p0, Landroid/view/animation/AccelerateInterpolator; */
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 5 */
		 p0 = e.f.a.c.j.a.b;
		 /* .line 6 */
	 } // :cond_1
	 /* instance-of v0, p0, Landroid/view/animation/DecelerateInterpolator; */
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 7 */
		 p0 = e.f.a.c.j.a.c;
	 } // :cond_2
	 /* .line 8 */
} // :cond_3
} // :goto_0
p0 = e.f.a.c.j.a.a;
} // .end method
/* # virtual methods */
public Long a ( ) {
/* .locals 2 */
/* .line 7 */
/* iget-wide v0, p0, Le/f/a/c/j/e;->a:J */
/* return-wide v0 */
} // .end method
public void a ( android.animation.Animator p0 ) {
/* .locals 2 */
/* .line 1 */
(( e.f.a.c.j.e ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/c/j/e;->a()J
/* move-result-wide v0 */
(( android.animation.Animator ) p1 ).setStartDelay ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/animation/Animator;->setStartDelay(J)V
/* .line 2 */
(( e.f.a.c.j.e ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/j/e;->b()J
/* move-result-wide v0 */
(( android.animation.Animator ) p1 ).setDuration ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;
/* .line 3 */
(( e.f.a.c.j.e ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/c/j/e;->c()Landroid/animation/TimeInterpolator;
(( android.animation.Animator ) p1 ).setInterpolator ( v0 ); // invoke-virtual {p1, v0}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V
/* .line 4 */
/* instance-of v0, p1, Landroid/animation/ValueAnimator; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
/* check-cast p1, Landroid/animation/ValueAnimator; */
v0 = (( e.f.a.c.j.e ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/a/c/j/e;->d()I
(( android.animation.ValueAnimator ) p1 ).setRepeatCount ( v0 ); // invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V
/* .line 6 */
v0 = (( e.f.a.c.j.e ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/a/c/j/e;->e()I
(( android.animation.ValueAnimator ) p1 ).setRepeatMode ( v0 ); // invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V
} // :cond_0
return;
} // .end method
public Long b ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-wide v0, p0, Le/f/a/c/j/e;->b:J */
/* return-wide v0 */
} // .end method
public android.animation.TimeInterpolator c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
v0 = e.f.a.c.j.a.a;
} // :goto_0
} // .end method
public Integer d ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/f/a/c/j/e;->d:I */
} // .end method
public Integer e ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/f/a/c/j/e;->e:I */
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 6 */
/* if-ne p0, p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_6
/* .line 1 */
/* const-class v1, Le/f/a/c/j/e; */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* if-eq v1, v2, :cond_1 */
/* .line 2 */
} // :cond_1
/* check-cast p1, Le/f/a/c/j/e; */
/* .line 3 */
(( e.f.a.c.j.e ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/c/j/e;->a()J
/* move-result-wide v1 */
(( e.f.a.c.j.e ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/c/j/e;->a()J
/* move-result-wide v3 */
/* cmp-long v5, v1, v3 */
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 4 */
} // :cond_2
(( e.f.a.c.j.e ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/j/e;->b()J
/* move-result-wide v1 */
(( e.f.a.c.j.e ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/a/c/j/e;->b()J
/* move-result-wide v3 */
/* cmp-long v5, v1, v3 */
if ( v5 != null) { // if-eqz v5, :cond_3
/* .line 5 */
} // :cond_3
v1 = (( e.f.a.c.j.e ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/a/c/j/e;->d()I
v2 = (( e.f.a.c.j.e ) p1 ).d ( ); // invoke-virtual {p1}, Le/f/a/c/j/e;->d()I
/* if-eq v1, v2, :cond_4 */
/* .line 6 */
} // :cond_4
v1 = (( e.f.a.c.j.e ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/a/c/j/e;->e()I
v2 = (( e.f.a.c.j.e ) p1 ).e ( ); // invoke-virtual {p1}, Le/f/a/c/j/e;->e()I
/* if-eq v1, v2, :cond_5 */
/* .line 7 */
} // :cond_5
(( e.f.a.c.j.e ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/c/j/e;->c()Landroid/animation/TimeInterpolator;
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( e.f.a.c.j.e ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/a/c/j/e;->c()Landroid/animation/TimeInterpolator;
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
p1 = (( java.lang.Object ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
} // :cond_6
} // :goto_0
} // .end method
public Integer hashCode ( ) {
/* .locals 7 */
/* .line 1 */
(( e.f.a.c.j.e ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/c/j/e;->a()J
/* move-result-wide v0 */
(( e.f.a.c.j.e ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/c/j/e;->a()J
/* move-result-wide v2 */
/* const/16 v4, 0x20 */
/* ushr-long/2addr v2, v4 */
/* xor-long/2addr v0, v2 */
/* long-to-int v1, v0 */
/* mul-int/lit8 v1, v1, 0x1f */
/* .line 2 */
(( e.f.a.c.j.e ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/j/e;->b()J
/* move-result-wide v2 */
(( e.f.a.c.j.e ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/j/e;->b()J
/* move-result-wide v5 */
/* ushr-long v4, v5, v4 */
/* xor-long/2addr v2, v4 */
/* long-to-int v0, v2 */
/* add-int/2addr v1, v0 */
/* mul-int/lit8 v1, v1, 0x1f */
/* .line 3 */
(( e.f.a.c.j.e ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/c/j/e;->c()Landroid/animation/TimeInterpolator;
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
v0 = (( java.lang.Object ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
/* add-int/2addr v1, v0 */
/* mul-int/lit8 v1, v1, 0x1f */
/* .line 4 */
v0 = (( e.f.a.c.j.e ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/a/c/j/e;->d()I
/* add-int/2addr v1, v0 */
/* mul-int/lit8 v1, v1, 0x1f */
/* .line 5 */
v0 = (( e.f.a.c.j.e ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/a/c/j/e;->e()I
/* add-int/2addr v1, v0 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* const/16 v1, 0xa */
/* .line 2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 3 */
/* const-class v1, Le/f/a/c/j/e; */
(( java.lang.Class ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v1, 0x7b */
/* .line 4 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 5 */
v1 = java.lang.System .identityHashCode ( p0 );
java.lang.Integer .toHexString ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " delay: "; // const-string v1, " delay: "
/* .line 6 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 7 */
(( e.f.a.c.j.e ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/c/j/e;->a()J
/* move-result-wide v1 */
(( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v1 = " duration: "; // const-string v1, " duration: "
/* .line 8 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 9 */
(( e.f.a.c.j.e ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/j/e;->b()J
/* move-result-wide v1 */
(( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v1 = " interpolator: "; // const-string v1, " interpolator: "
/* .line 10 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 11 */
(( e.f.a.c.j.e ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/c/j/e;->c()Landroid/animation/TimeInterpolator;
(( java.lang.Object ) v1 ).getClass ( ); // invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = " repeatCount: "; // const-string v1, " repeatCount: "
/* .line 12 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 13 */
v1 = (( e.f.a.c.j.e ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/a/c/j/e;->d()I
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = " repeatMode: "; // const-string v1, " repeatMode: "
/* .line 14 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 15 */
v1 = (( e.f.a.c.j.e ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/a/c/j/e;->e()I
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = "}\n"; // const-string v1, "}\n"
/* .line 16 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 17 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method

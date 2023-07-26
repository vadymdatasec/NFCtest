public class e.f.a.c.j.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.e.i a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Lc/e/i<", */
	 /* "Ljava/lang/String;", */
	 /* "Le/f/a/c/j/e;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.f.a.c.j.d ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Lc/e/i; */
/* invoke-direct {v0}, Lc/e/i;-><init>()V */
this.a = v0;
return;
} // .end method
public static e.f.a.c.j.d a ( android.content.Context p0, Integer p1 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
try { // :try_start_0
	 android.animation.AnimatorInflater .loadAnimator ( p0,p1 );
	 /* .line 6 */
	 /* instance-of v1, p0, Landroid/animation/AnimatorSet; */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 7 */
		 /* check-cast p0, Landroid/animation/AnimatorSet; */
		 /* .line 8 */
		 (( android.animation.AnimatorSet ) p0 ).getChildAnimations ( ); // invoke-virtual {p0}, Landroid/animation/AnimatorSet;->getChildAnimations()Ljava/util/ArrayList;
		 e.f.a.c.j.d .a ( p0 );
	 } // :cond_0
	 if ( p0 != null) { // if-eqz p0, :cond_1
		 /* .line 9 */
		 /* new-instance v1, Ljava/util/ArrayList; */
		 /* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
		 /* .line 10 */
		 /* .line 11 */
		 e.f.a.c.j.d .a ( v1 );
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 } // :cond_1
	 /* :catch_0 */
	 /* move-exception p0 */
	 /* .line 12 */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "Can\'t load animation resource ID #0x"; // const-string v2, "Can\'t load animation resource ID #0x"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 java.lang.Integer .toHexString ( p1 );
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 final String v1 = "MotionSpec"; // const-string v1, "MotionSpec"
	 android.util.Log .w ( v1,p1,p0 );
} // .end method
public static e.f.a.c.j.d a ( java.util.List p0 ) {
	 /* .locals 4 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/util/List<", */
	 /* "Landroid/animation/Animator;", */
	 /* ">;)", */
	 /* "Le/f/a/c/j/d;" */
	 /* } */
} // .end annotation
/* .line 13 */
/* new-instance v0, Le/f/a/c/j/d; */
/* invoke-direct {v0}, Le/f/a/c/j/d;-><init>()V */
v1 = /* .line 14 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_0 */
/* .line 15 */
/* check-cast v3, Landroid/animation/Animator; */
e.f.a.c.j.d .a ( v0,v3 );
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
} // .end method
public static void a ( Object p0, android.animation.Animator p1 ) {
/* .locals 2 */
/* .line 16 */
/* instance-of v0, p1, Landroid/animation/ObjectAnimator; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 17 */
/* check-cast p1, Landroid/animation/ObjectAnimator; */
/* .line 18 */
(( android.animation.ObjectAnimator ) p1 ).getPropertyName ( ); // invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->getPropertyName()Ljava/lang/String;
e.f.a.c.j.e .a ( p1 );
(( e.f.a.c.j.d ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/f/a/c/j/d;->a(Ljava/lang/String;Le/f/a/c/j/e;)V
return;
/* .line 19 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Animator must be an ObjectAnimator: "; // const-string v1, "Animator must be an ObjectAnimator: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
/* # virtual methods */
public e.f.a.c.j.e a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( e.f.a.c.j.d ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/j/d;->b(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.a;
(( c.e.i ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Le/f/a/c/j/e; */
/* .line 3 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V */
/* throw p1 */
} // .end method
public void a ( java.lang.String p0, Object p1 ) {
/* .locals 1 */
/* .line 4 */
v0 = this.a;
(( c.e.i ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
return;
} // .end method
public Boolean b ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( c.e.i ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 2 */
/* if-ne p0, p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 1 */
/* const-class v0, Le/f/a/c/j/d; */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* if-eq v0, v1, :cond_1 */
/* .line 2 */
} // :cond_1
/* check-cast p1, Le/f/a/c/j/d; */
/* .line 3 */
v0 = this.a;
p1 = this.a;
p1 = (( c.e.i ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->equals(Ljava/lang/Object;)Z
} // :cond_2
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = (( c.e.i ) v0 ).hashCode ( ); // invoke-virtual {v0}, Lc/e/i;->hashCode()I
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* const/16 v1, 0xa */
/* .line 2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 3 */
/* const-class v1, Le/f/a/c/j/d; */
(( java.lang.Class ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v1, 0x7b */
/* .line 4 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 5 */
v1 = java.lang.System .identityHashCode ( p0 );
java.lang.Integer .toHexString ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " timings: "; // const-string v1, " timings: "
/* .line 6 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 7 */
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = "}\n"; // const-string v1, "}\n"
/* .line 8 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 9 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method

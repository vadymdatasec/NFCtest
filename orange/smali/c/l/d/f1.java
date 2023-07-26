public class c.l.d.f1 implements c.a.k.c {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Lc/a/k/c<", */
	 /* "Lc/a/k/b;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final c.l.d.o1 a; //synthetic
/* # direct methods */
public c.l.d.f1 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.a = p1;
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public void a ( Object p0 ) {
	 /* .locals 4 */
	 /* .line 2 */
	 v0 = this.a;
	 v0 = this.C;
	 (( java.util.ArrayDeque ) v0 ).pollFirst ( ); // invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;
	 /* check-cast v0, Lc/l/d/j1; */
	 final String v1 = "FragmentManager"; // const-string v1, "FragmentManager"
	 /* if-nez v0, :cond_0 */
	 /* .line 3 */
	 /* new-instance p1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v0 = "No Activities were started for result for "; // const-string v0, "No Activities were started for result for "
	 (( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) p1 ).append ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .w ( v1,p1 );
	 return;
	 /* .line 4 */
} // :cond_0
v2 = this.b;
/* .line 5 */
/* iget v0, v0, Lc/l/d/j1;->c:I */
/* .line 6 */
v3 = this.a;
c.l.d.o1 .c ( v3 );
(( c.l.d.c2 ) v3 ).d ( v2 ); // invoke-virtual {v3, v2}, Lc/l/d/c2;->d(Ljava/lang/String;)Landroidx/fragment/app/Fragment;
/* if-nez v3, :cond_1 */
/* .line 7 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "Activity result delivered for unknown Fragment "; // const-string v0, "Activity result delivered for unknown Fragment "
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v1,p1 );
return;
/* .line 8 */
} // :cond_1
v1 = (( c.a.k.b ) p1 ).b ( ); // invoke-virtual {p1}, Lc/a/k/b;->b()I
/* .line 9 */
(( c.a.k.b ) p1 ).a ( ); // invoke-virtual {p1}, Lc/a/k/b;->a()Landroid/content/Intent;
/* .line 10 */
(( androidx.fragment.app.Fragment ) v3 ).a ( v0, v1, p1 ); // invoke-virtual {v3, v0, v1, p1}, Landroidx/fragment/app/Fragment;->a(IILandroid/content/Intent;)V
return;
} // .end method
public void a ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Lc/a/k/b; */
(( c.l.d.f1 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/l/d/f1;->a(Lc/a/k/b;)V
return;
} // .end method

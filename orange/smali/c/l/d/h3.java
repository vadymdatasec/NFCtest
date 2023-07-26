public abstract class c.l.d.h3 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public c.l.d.g3 a;
	 public c.l.d.f3 b;
	 public final androidx.fragment.app.Fragment c;
	 public final java.util.List d;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Ljava/lang/Runnable;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final java.util.HashSet e;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashSet<", */
/* "Lc/h/j/c;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public Boolean f;
public Boolean g;
/* # direct methods */
public c.l.d.h3 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.d = v0;
/* .line 3 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
this.e = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* iput-boolean v0, p0, Lc/l/d/h3;->f:Z */
/* .line 5 */
/* iput-boolean v0, p0, Lc/l/d/h3;->g:Z */
/* .line 6 */
this.a = p1;
/* .line 7 */
this.b = p2;
/* .line 8 */
this.c = p3;
/* .line 9 */
/* new-instance p1, Lc/l/d/e3; */
/* invoke-direct {p1, p0}, Lc/l/d/e3;-><init>(Lc/l/d/h3;)V */
(( c.h.j.c ) p4 ).a ( p1 ); // invoke-virtual {p4, p1}, Lc/h/j/c;->a(Lc/h/j/b;)V
return;
} // .end method
/* # virtual methods */
public final void a ( ) {
/* .locals 2 */
/* .line 1 */
v0 = (( c.l.d.h3 ) p0 ).f ( ); // invoke-virtual {p0}, Lc/l/d/h3;->f()Z
if ( v0 != null) { // if-eqz v0, :cond_0
return;
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
/* iput-boolean v0, p0, Lc/l/d/h3;->f:Z */
/* .line 3 */
v0 = this.e;
v0 = (( java.util.HashSet ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
(( c.l.d.h3 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/l/d/h3;->b()V
/* .line 5 */
} // :cond_1
/* new-instance v0, Ljava/util/ArrayList; */
v1 = this.e;
/* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
/* .line 6 */
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* check-cast v1, Lc/h/j/c; */
/* .line 7 */
(( c.h.j.c ) v1 ).a ( ); // invoke-virtual {v1}, Lc/h/j/c;->a()V
} // :cond_2
} // :goto_1
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 1 */
/* .line 23 */
v0 = this.e;
p1 = (( java.util.HashSet ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = this.e;
p1 = (( java.util.HashSet ) p1 ).isEmpty ( ); // invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 24 */
(( c.l.d.h3 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/l/d/h3;->b()V
} // :cond_0
return;
} // .end method
public final void a ( c.l.d.g3 p0, c.l.d.f3 p1 ) {
/* .locals 5 */
/* .line 8 */
v0 = c.l.d.c3.b;
p2 = (( java.lang.Enum ) p2 ).ordinal ( ); // invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I
/* aget p2, v0, p2 */
int v0 = 1; // const/4 v0, 0x1
final String v1 = "SpecialEffectsController: For fragment "; // const-string v1, "SpecialEffectsController: For fragment "
final String v2 = "FragmentManager"; // const-string v2, "FragmentManager"
int v3 = 2; // const/4 v3, 0x2
/* if-eq p2, v0, :cond_4 */
final String v0 = " mFinalState = "; // const-string v0, " mFinalState = "
/* if-eq p2, v3, :cond_2 */
int v4 = 3; // const/4 v4, 0x3
/* if-eq p2, v4, :cond_0 */
/* goto/16 :goto_0 */
/* .line 9 */
} // :cond_0
p2 = this.a;
v4 = c.l.d.g3.b;
/* if-eq p2, v4, :cond_6 */
/* .line 10 */
p2 = c.l.d.o1 .d ( v3 );
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 11 */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.c;
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = this.a;
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v0 = " -> "; // const-string v0, " -> "
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v0 = "."; // const-string v0, "."
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v2,p2 );
/* .line 12 */
} // :cond_1
this.a = p1;
/* .line 13 */
} // :cond_2
p1 = c.l.d.o1 .d ( v3 );
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 14 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p2 = this.c;
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p2 = this.a;
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p2 = " -> REMOVED.mLifecycleImpact = "; // const-string p2, " -> REMOVED.mLifecycleImpact = "
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p2 = this.b;
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p2 = " to REMOVING."; // const-string p2, " to REMOVING."
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v2,p1 );
/* .line 15 */
} // :cond_3
p1 = c.l.d.g3.b;
this.a = p1;
/* .line 16 */
p1 = c.l.d.f3.d;
this.b = p1;
/* .line 17 */
} // :cond_4
p1 = this.a;
p2 = c.l.d.g3.b;
/* if-ne p1, p2, :cond_6 */
/* .line 18 */
p1 = c.l.d.o1 .d ( v3 );
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 19 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p2 = this.c;
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p2 = " mFinalState = REMOVED -> VISIBLE.mLifecycleImpact = "; // const-string p2, " mFinalState = REMOVED -> VISIBLE.mLifecycleImpact = "
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p2 = this.b;
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p2 = " to ADDING."; // const-string p2, " to ADDING."
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v2,p1 );
/* .line 20 */
} // :cond_5
p1 = c.l.d.g3.c;
this.a = p1;
/* .line 21 */
p1 = c.l.d.f3.c;
this.b = p1;
} // :cond_6
} // :goto_0
return;
} // .end method
public final void a ( java.lang.Runnable p0 ) {
/* .locals 1 */
/* .line 22 */
v0 = this.d;
return;
} // .end method
public void b ( ) {
/* .locals 2 */
/* .line 3 */
/* iget-boolean v0, p0, Lc/l/d/h3;->g:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
} // :cond_0
int v0 = 2; // const/4 v0, 0x2
/* .line 4 */
v0 = c.l.d.o1 .d ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "SpecialEffectsController: "; // const-string v1, "SpecialEffectsController: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = " has called complete."; // const-string v1, " has called complete."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "FragmentManager"; // const-string v1, "FragmentManager"
android.util.Log .v ( v1,v0 );
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
/* .line 6 */
/* iput-boolean v0, p0, Lc/l/d/h3;->g:Z */
/* .line 7 */
v0 = this.d;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* check-cast v1, Ljava/lang/Runnable; */
/* .line 8 */
} // :cond_2
return;
} // .end method
public final void b ( Object p0 ) {
/* .locals 1 */
/* .line 1 */
(( c.l.d.h3 ) p0 ).h ( ); // invoke-virtual {p0}, Lc/l/d/h3;->h()V
/* .line 2 */
v0 = this.e;
(( java.util.HashSet ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
return;
} // .end method
public c.l.d.g3 c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public final androidx.fragment.app.Fragment d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public c.l.d.f3 e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public final Boolean f ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/l/d/h3;->f:Z */
} // .end method
public final Boolean g ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/l/d/h3;->g:Z */
} // .end method
public abstract void h ( ) {
} // .end method
public java.lang.String toString ( ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Operation "; // const-string v1, "Operation "
/* .line 2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "{"; // const-string v1, "{"
/* .line 3 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 4 */
v2 = java.lang.System .identityHashCode ( p0 );
java.lang.Integer .toHexString ( v2 );
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "} "; // const-string v2, "} "
/* .line 5 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 6 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "mFinalState = "; // const-string v3, "mFinalState = "
/* .line 7 */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 8 */
v3 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* .line 9 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 10 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "mLifecycleImpact = "; // const-string v3, "mLifecycleImpact = "
/* .line 11 */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 12 */
v3 = this.b;
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* .line 13 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 14 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "mFragment = "; // const-string v1, "mFragment = "
/* .line 15 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 16 */
v1 = this.c;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = "}"; // const-string v1, "}"
/* .line 17 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 18 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method

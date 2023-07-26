public abstract class c.l.d.i3 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.view.ViewGroup a;
	 public final java.util.ArrayList b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList<", */
	 /* "Lc/l/d/h3;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final java.util.ArrayList c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Lc/l/d/h3;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public Boolean d;
public Boolean e;
/* # direct methods */
public c.l.d.i3 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.b = v0;
/* .line 3 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.c = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* iput-boolean v0, p0, Lc/l/d/i3;->d:Z */
/* .line 5 */
/* iput-boolean v0, p0, Lc/l/d/i3;->e:Z */
/* .line 6 */
this.a = p1;
return;
} // .end method
public static c.l.d.i3 a ( android.view.ViewGroup p0, c.l.d.j3 p1 ) {
/* .locals 2 */
/* .line 3 */
(( android.view.ViewGroup ) p0 ).getTag ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getTag(I)Ljava/lang/Object;
/* .line 4 */
/* instance-of v1, v0, Lc/l/d/i3; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 5 */
/* check-cast v0, Lc/l/d/i3; */
/* .line 6 */
} // :cond_0
/* .line 7 */
(( android.view.ViewGroup ) p0 ).setTag ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Landroid/view/ViewGroup;->setTag(ILjava/lang/Object;)V
} // .end method
public static c.l.d.i3 a ( android.view.ViewGroup p0, c.l.d.o1 p1 ) {
/* .locals 0 */
/* .line 1 */
(( c.l.d.o1 ) p1 ).F ( ); // invoke-virtual {p1}, Lc/l/d/o1;->F()Lc/l/d/j3;
/* .line 2 */
c.l.d.i3 .a ( p0,p1 );
} // .end method
/* # virtual methods */
public final c.l.d.h3 a ( androidx.fragment.app.Fragment p0 ) {
/* .locals 3 */
/* .line 8 */
v0 = this.b;
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Lc/l/d/h3; */
/* .line 9 */
(( c.l.d.h3 ) v1 ).d ( ); // invoke-virtual {v1}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;
v2 = (( androidx.fragment.app.Fragment ) v2 ).equals ( p1 ); // invoke-virtual {v2, p1}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
v2 = (( c.l.d.h3 ) v1 ).f ( ); // invoke-virtual {v1}, Lc/l/d/h3;->f()Z
/* if-nez v2, :cond_0 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void a ( ) {
/* .locals 7 */
/* .line 31 */
/* iget-boolean v0, p0, Lc/l/d/i3;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 32 */
} // :cond_0
v0 = this.a;
v0 = c.h.n.v0 .C ( v0 );
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_1 */
/* .line 33 */
(( c.l.d.i3 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/l/d/i3;->b()V
/* .line 34 */
/* iput-boolean v1, p0, Lc/l/d/i3;->d:Z */
return;
/* .line 35 */
} // :cond_1
v0 = this.b;
/* monitor-enter v0 */
/* .line 36 */
try { // :try_start_0
v2 = this.b;
v2 = (( java.util.ArrayList ) v2 ).isEmpty ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z
/* if-nez v2, :cond_6 */
/* .line 37 */
/* new-instance v2, Ljava/util/ArrayList; */
v3 = this.c;
/* invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
/* .line 38 */
v3 = this.c;
(( java.util.ArrayList ) v3 ).clear ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V
/* .line 39 */
(( java.util.ArrayList ) v2 ).iterator ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
} // :cond_2
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_4
/* check-cast v3, Lc/l/d/h3; */
int v4 = 2; // const/4 v4, 0x2
/* .line 40 */
v4 = c.l.d.o1 .d ( v4 );
if ( v4 != null) { // if-eqz v4, :cond_3
final String v4 = "FragmentManager"; // const-string v4, "FragmentManager"
/* .line 41 */
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "SpecialEffectsController: Cancelling operation "; // const-string v6, "SpecialEffectsController: Cancelling operation "
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v4,v5 );
/* .line 42 */
} // :cond_3
(( c.l.d.h3 ) v3 ).a ( ); // invoke-virtual {v3}, Lc/l/d/h3;->a()V
/* .line 43 */
v4 = (( c.l.d.h3 ) v3 ).g ( ); // invoke-virtual {v3}, Lc/l/d/h3;->g()Z
/* if-nez v4, :cond_2 */
/* .line 44 */
v4 = this.c;
(( java.util.ArrayList ) v4 ).add ( v3 ); // invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 45 */
} // :cond_4
(( c.l.d.i3 ) p0 ).f ( ); // invoke-virtual {p0}, Lc/l/d/i3;->f()V
/* .line 46 */
/* new-instance v2, Ljava/util/ArrayList; */
v3 = this.b;
/* invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
/* .line 47 */
v3 = this.b;
(( java.util.ArrayList ) v3 ).clear ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V
/* .line 48 */
v3 = this.c;
(( java.util.ArrayList ) v3 ).addAll ( v2 ); // invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
/* .line 49 */
(( java.util.ArrayList ) v2 ).iterator ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v4 = } // :goto_1
if ( v4 != null) { // if-eqz v4, :cond_5
/* check-cast v4, Lc/l/d/h3; */
/* .line 50 */
(( c.l.d.h3 ) v4 ).h ( ); // invoke-virtual {v4}, Lc/l/d/h3;->h()V
/* .line 51 */
} // :cond_5
/* iget-boolean v3, p0, Lc/l/d/i3;->d:Z */
(( c.l.d.i3 ) p0 ).a ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lc/l/d/i3;->a(Ljava/util/List;Z)V
/* .line 52 */
/* iput-boolean v1, p0, Lc/l/d/i3;->d:Z */
/* .line 53 */
} // :cond_6
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
public void a ( c.l.d.a2 p0 ) {
/* .locals 2 */
int v0 = 2; // const/4 v0, 0x2
/* .line 15 */
v0 = c.l.d.o1 .d ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 16 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "SpecialEffectsController: Enqueuing hide operation for fragment "; // const-string v1, "SpecialEffectsController: Enqueuing hide operation for fragment "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 17 */
(( c.l.d.a2 ) p1 ).k ( ); // invoke-virtual {p1}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "FragmentManager"; // const-string v1, "FragmentManager"
/* .line 18 */
android.util.Log .v ( v1,v0 );
/* .line 19 */
} // :cond_0
v0 = c.l.d.g3.d;
v1 = c.l.d.f3.b;
(( c.l.d.i3 ) p0 ).a ( v0, v1, p1 ); // invoke-virtual {p0, v0, v1, p1}, Lc/l/d/i3;->a(Lc/l/d/g3;Lc/l/d/f3;Lc/l/d/a2;)V
return;
} // .end method
public void a ( c.l.d.g3 p0, c.l.d.a2 p1 ) {
/* .locals 2 */
int v0 = 2; // const/4 v0, 0x2
/* .line 10 */
v0 = c.l.d.o1 .d ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 11 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "SpecialEffectsController: Enqueuing add operation for fragment "; // const-string v1, "SpecialEffectsController: Enqueuing add operation for fragment "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 12 */
(( c.l.d.a2 ) p2 ).k ( ); // invoke-virtual {p2}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "FragmentManager"; // const-string v1, "FragmentManager"
/* .line 13 */
android.util.Log .v ( v1,v0 );
/* .line 14 */
} // :cond_0
v0 = c.l.d.f3.c;
(( c.l.d.i3 ) p0 ).a ( p1, v0, p2 ); // invoke-virtual {p0, p1, v0, p2}, Lc/l/d/i3;->a(Lc/l/d/g3;Lc/l/d/f3;Lc/l/d/a2;)V
return;
} // .end method
public final void a ( c.l.d.g3 p0, c.l.d.f3 p1, c.l.d.a2 p2 ) {
/* .locals 3 */
/* .line 20 */
v0 = this.b;
/* monitor-enter v0 */
/* .line 21 */
try { // :try_start_0
/* new-instance v1, Lc/h/j/c; */
/* invoke-direct {v1}, Lc/h/j/c;-><init>()V */
/* .line 22 */
(( c.l.d.a2 ) p3 ).k ( ); // invoke-virtual {p3}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;
(( c.l.d.i3 ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Lc/l/d/i3;->a(Landroidx/fragment/app/Fragment;)Lc/l/d/h3;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 23 */
(( c.l.d.h3 ) v2 ).a ( p1, p2 ); // invoke-virtual {v2, p1, p2}, Lc/l/d/h3;->a(Lc/l/d/g3;Lc/l/d/f3;)V
/* .line 24 */
/* monitor-exit v0 */
return;
/* .line 25 */
} // :cond_0
/* new-instance v2, Lc/l/d/d3; */
/* invoke-direct {v2, p1, p2, p3, v1}, Lc/l/d/d3;-><init>(Lc/l/d/g3;Lc/l/d/f3;Lc/l/d/a2;Lc/h/j/c;)V */
/* .line 26 */
p1 = this.b;
(( java.util.ArrayList ) p1 ).add ( v2 ); // invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 27 */
/* new-instance p1, Lc/l/d/a3; */
/* invoke-direct {p1, p0, v2}, Lc/l/d/a3;-><init>(Lc/l/d/i3;Lc/l/d/d3;)V */
(( c.l.d.h3 ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Lc/l/d/h3;->a(Ljava/lang/Runnable;)V
/* .line 28 */
/* new-instance p1, Lc/l/d/b3; */
/* invoke-direct {p1, p0, v2}, Lc/l/d/b3;-><init>(Lc/l/d/i3;Lc/l/d/d3;)V */
(( c.l.d.h3 ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Lc/l/d/h3;->a(Ljava/lang/Runnable;)V
/* .line 29 */
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
public abstract void a ( java.util.List p0, Boolean p1 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lc/l/d/h3;", */
/* ">;Z)V" */
/* } */
} // .end annotation
} // .end method
public void a ( Boolean p0 ) {
/* .locals 0 */
/* .line 30 */
/* iput-boolean p1, p0, Lc/l/d/i3;->d:Z */
return;
} // .end method
public final c.l.d.h3 b ( androidx.fragment.app.Fragment p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.c;
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Lc/l/d/h3; */
/* .line 2 */
(( c.l.d.h3 ) v1 ).d ( ); // invoke-virtual {v1}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;
v2 = (( androidx.fragment.app.Fragment ) v2 ).equals ( p1 ); // invoke-virtual {v2, p1}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
v2 = (( c.l.d.h3 ) v1 ).f ( ); // invoke-virtual {v1}, Lc/l/d/h3;->f()Z
/* if-nez v2, :cond_0 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void b ( ) {
/* .locals 9 */
/* .line 8 */
v0 = this.a;
v0 = c.h.n.v0 .C ( v0 );
/* .line 9 */
v1 = this.b;
/* monitor-enter v1 */
/* .line 10 */
try { // :try_start_0
(( c.l.d.i3 ) p0 ).f ( ); // invoke-virtual {p0}, Lc/l/d/i3;->f()V
/* .line 11 */
v2 = this.b;
(( java.util.ArrayList ) v2 ).iterator ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_0
/* check-cast v3, Lc/l/d/h3; */
/* .line 12 */
(( c.l.d.h3 ) v3 ).h ( ); // invoke-virtual {v3}, Lc/l/d/h3;->h()V
/* .line 13 */
} // :cond_0
/* new-instance v2, Ljava/util/ArrayList; */
v3 = this.c;
/* invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
/* .line 14 */
(( java.util.ArrayList ) v2 ).iterator ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v3 = } // :goto_1
int v4 = 2; // const/4 v4, 0x2
if ( v3 != null) { // if-eqz v3, :cond_3
/* check-cast v3, Lc/l/d/h3; */
/* .line 15 */
v4 = c.l.d.o1 .d ( v4 );
if ( v4 != null) { // if-eqz v4, :cond_2
final String v4 = "FragmentManager"; // const-string v4, "FragmentManager"
/* .line 16 */
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "SpecialEffectsController: "; // const-string v6, "SpecialEffectsController: "
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
if ( v0 != null) { // if-eqz v0, :cond_1
final String v6 = ""; // const-string v6, ""
/* .line 17 */
} // :cond_1
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "Container "; // const-string v7, "Container "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v7 = this.a;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v7 = " is not attached to window."; // const-string v7, " is not attached to window."
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_2
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = "Cancelling running operation "; // const-string v6, "Cancelling running operation "
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 18 */
android.util.Log .v ( v4,v5 );
/* .line 19 */
} // :cond_2
(( c.l.d.h3 ) v3 ).a ( ); // invoke-virtual {v3}, Lc/l/d/h3;->a()V
/* .line 20 */
} // :cond_3
/* new-instance v2, Ljava/util/ArrayList; */
v3 = this.b;
/* invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
/* .line 21 */
(( java.util.ArrayList ) v2 ).iterator ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v3 = } // :goto_3
if ( v3 != null) { // if-eqz v3, :cond_6
/* check-cast v3, Lc/l/d/h3; */
/* .line 22 */
v5 = c.l.d.o1 .d ( v4 );
if ( v5 != null) { // if-eqz v5, :cond_5
final String v5 = "FragmentManager"; // const-string v5, "FragmentManager"
/* .line 23 */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "SpecialEffectsController: "; // const-string v7, "SpecialEffectsController: "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
if ( v0 != null) { // if-eqz v0, :cond_4
final String v7 = ""; // const-string v7, ""
/* .line 24 */
} // :cond_4
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
final String v8 = "Container "; // const-string v8, "Container "
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v8 = this.a;
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v8 = " is not attached to window."; // const-string v8, " is not attached to window."
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_4
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "Cancelling pending operation "; // const-string v7, "Cancelling pending operation "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( v3 ); // invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 25 */
android.util.Log .v ( v5,v6 );
/* .line 26 */
} // :cond_5
(( c.l.d.h3 ) v3 ).a ( ); // invoke-virtual {v3}, Lc/l/d/h3;->a()V
/* .line 27 */
} // :cond_6
/* monitor-exit v1 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void b ( c.l.d.a2 p0 ) {
/* .locals 2 */
int v0 = 2; // const/4 v0, 0x2
/* .line 3 */
v0 = c.l.d.o1 .d ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "SpecialEffectsController: Enqueuing remove operation for fragment "; // const-string v1, "SpecialEffectsController: Enqueuing remove operation for fragment "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 5 */
(( c.l.d.a2 ) p1 ).k ( ); // invoke-virtual {p1}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "FragmentManager"; // const-string v1, "FragmentManager"
/* .line 6 */
android.util.Log .v ( v1,v0 );
/* .line 7 */
} // :cond_0
v0 = c.l.d.g3.b;
v1 = c.l.d.f3.d;
(( c.l.d.i3 ) p0 ).a ( v0, v1, p1 ); // invoke-virtual {p0, v0, v1, p1}, Lc/l/d/i3;->a(Lc/l/d/g3;Lc/l/d/f3;Lc/l/d/a2;)V
return;
} // .end method
public void c ( ) {
/* .locals 1 */
/* .line 6 */
/* iget-boolean v0, p0, Lc/l/d/i3;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 7 */
/* iput-boolean v0, p0, Lc/l/d/i3;->e:Z */
/* .line 8 */
(( c.l.d.i3 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/l/d/i3;->a()V
} // :cond_0
return;
} // .end method
public void c ( c.l.d.a2 p0 ) {
/* .locals 2 */
int v0 = 2; // const/4 v0, 0x2
/* .line 1 */
v0 = c.l.d.o1 .d ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "SpecialEffectsController: Enqueuing show operation for fragment "; // const-string v1, "SpecialEffectsController: Enqueuing show operation for fragment "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 3 */
(( c.l.d.a2 ) p1 ).k ( ); // invoke-virtual {p1}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "FragmentManager"; // const-string v1, "FragmentManager"
/* .line 4 */
android.util.Log .v ( v1,v0 );
/* .line 5 */
} // :cond_0
v0 = c.l.d.g3.c;
v1 = c.l.d.f3.b;
(( c.l.d.i3 ) p0 ).a ( v0, v1, p1 ); // invoke-virtual {p0, v0, v1, p1}, Lc/l/d/i3;->a(Lc/l/d/g3;Lc/l/d/f3;Lc/l/d/a2;)V
return;
} // .end method
public android.view.ViewGroup d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public c.l.d.f3 d ( c.l.d.a2 p0 ) {
/* .locals 2 */
/* .line 2 */
(( c.l.d.a2 ) p1 ).k ( ); // invoke-virtual {p1}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;
(( c.l.d.i3 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/l/d/i3;->a(Landroidx/fragment/app/Fragment;)Lc/l/d/h3;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.l.d.h3 ) v0 ).e ( ); // invoke-virtual {v0}, Lc/l/d/h3;->e()Lc/l/d/f3;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
} // :goto_0
(( c.l.d.a2 ) p1 ).k ( ); // invoke-virtual {p1}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;
(( c.l.d.i3 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/l/d/i3;->b(Landroidx/fragment/app/Fragment;)Lc/l/d/h3;
if ( p1 != null) { // if-eqz p1, :cond_2
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
v1 = c.l.d.f3.b;
/* if-ne v0, v1, :cond_2 */
/* .line 6 */
} // :cond_1
(( c.l.d.h3 ) p1 ).e ( ); // invoke-virtual {p1}, Lc/l/d/h3;->e()Lc/l/d/f3;
} // :cond_2
} // .end method
public void e ( ) {
/* .locals 6 */
/* .line 1 */
v0 = this.b;
/* monitor-enter v0 */
/* .line 2 */
try { // :try_start_0
(( c.l.d.i3 ) p0 ).f ( ); // invoke-virtual {p0}, Lc/l/d/i3;->f()V
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
/* iput-boolean v1, p0, Lc/l/d/i3;->e:Z */
/* .line 4 */
v1 = this.b;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v1, v1, -0x1 */
} // :goto_0
/* if-ltz v1, :cond_1 */
/* .line 5 */
v2 = this.b;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Lc/l/d/h3; */
/* .line 6 */
(( c.l.d.h3 ) v2 ).d ( ); // invoke-virtual {v2}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;
v3 = this.I;
c.l.d.g3 .b ( v3 );
/* .line 7 */
(( c.l.d.h3 ) v2 ).c ( ); // invoke-virtual {v2}, Lc/l/d/h3;->c()Lc/l/d/g3;
v5 = c.l.d.g3.c;
/* if-ne v4, v5, :cond_0 */
v4 = c.l.d.g3.c;
/* if-eq v3, v4, :cond_0 */
/* .line 8 */
(( c.l.d.h3 ) v2 ).d ( ); // invoke-virtual {v2}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;
/* .line 9 */
v1 = (( androidx.fragment.app.Fragment ) v1 ).V ( ); // invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->V()Z
/* iput-boolean v1, p0, Lc/l/d/i3;->e:Z */
} // :cond_0
/* add-int/lit8 v1, v1, -0x1 */
/* .line 10 */
} // :cond_1
} // :goto_1
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
public final void f ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.b;
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
} // :cond_0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Lc/l/d/h3; */
/* .line 2 */
(( c.l.d.h3 ) v1 ).e ( ); // invoke-virtual {v1}, Lc/l/d/h3;->e()Lc/l/d/f3;
v3 = c.l.d.f3.c;
/* if-ne v2, v3, :cond_0 */
/* .line 3 */
(( c.l.d.h3 ) v1 ).d ( ); // invoke-virtual {v1}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;
/* .line 4 */
(( androidx.fragment.app.Fragment ) v2 ).w0 ( ); // invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->w0()Landroid/view/View;
/* .line 5 */
v2 = (( android.view.View ) v2 ).getVisibility ( ); // invoke-virtual {v2}, Landroid/view/View;->getVisibility()I
c.l.d.g3 .a ( v2 );
/* .line 6 */
v3 = c.l.d.f3.b;
(( c.l.d.h3 ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lc/l/d/h3;->a(Lc/l/d/g3;Lc/l/d/f3;)V
} // :cond_1
return;
} // .end method

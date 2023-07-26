public class c.l.d.c2 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.ArrayList a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList<", */
	 /* "Landroidx/fragment/app/Fragment;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final java.util.HashMap b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap<", */
/* "Ljava/lang/String;", */
/* "Lc/l/d/a2;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public c.l.d.t1 c;
/* # direct methods */
public c.l.d.c2 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.a = v0;
/* .line 3 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.b = v0;
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 2 */
/* .line 28 */
v0 = this.b;
(( java.util.HashMap ) v0 ).values ( ); // invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;
int v1 = 0; // const/4 v1, 0x0
/* .line 29 */
java.util.Collections .singleton ( v1 );
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 2 */
/* .line 26 */
v0 = this.b;
(( java.util.HashMap ) v0 ).values ( ); // invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;
} // :cond_0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Lc/l/d/a2; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 27 */
(( c.l.d.a2 ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Lc/l/d/a2;->a(I)V
} // :cond_1
return;
} // .end method
public void a ( androidx.fragment.app.Fragment p0 ) {
/* .locals 3 */
/* .line 19 */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).contains ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
/* .line 20 */
v0 = this.a;
/* monitor-enter v0 */
/* .line 21 */
try { // :try_start_0
v1 = this.a;
(( java.util.ArrayList ) v1 ).add ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 22 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 23 */
/* iput-boolean v0, p1, Landroidx/fragment/app/Fragment;->m:Z */
return;
/* :catchall_0 */
/* move-exception p1 */
/* .line 24 */
try { // :try_start_1
/* monitor-exit v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw p1 */
/* .line 25 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Fragment already added: "; // const-string v2, "Fragment already added: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public void a ( c.l.d.a2 p0 ) {
/* .locals 3 */
/* .line 9 */
(( c.l.d.a2 ) p1 ).k ( ); // invoke-virtual {p1}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;
/* .line 10 */
v1 = this.g;
v1 = (( c.l.d.c2 ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lc/l/d/c2;->a(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
return;
/* .line 11 */
} // :cond_0
v1 = this.b;
v2 = this.g;
(( java.util.HashMap ) v1 ).put ( v2, p1 ); // invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 12 */
/* iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->D:Z */
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 13 */
/* iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->C:Z */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 14 */
p1 = this.c;
(( c.l.d.t1 ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/l/d/t1;->a(Landroidx/fragment/app/Fragment;)V
/* .line 15 */
} // :cond_1
p1 = this.c;
(( c.l.d.t1 ) p1 ).e ( v0 ); // invoke-virtual {p1, v0}, Lc/l/d/t1;->e(Landroidx/fragment/app/Fragment;)V
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
/* .line 16 */
/* iput-boolean p1, v0, Landroidx/fragment/app/Fragment;->D:Z */
} // :cond_2
int p1 = 2; // const/4 p1, 0x2
/* .line 17 */
p1 = c.l.d.o1 .d ( p1 );
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 18 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Added fragment to active set "; // const-string v1, "Added fragment to active set "
(( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "FragmentManager"; // const-string v0, "FragmentManager"
android.util.Log .v ( v0,p1 );
} // :cond_3
return;
} // .end method
public void a ( c.l.d.t1 p0 ) {
/* .locals 0 */
/* .line 1 */
this.c = p1;
return;
} // .end method
public void a ( java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3 ) {
/* .locals 3 */
/* .line 31 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " "; // const-string v1, " "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 32 */
v1 = this.b;
v1 = (( java.util.HashMap ) v1 ).isEmpty ( ); // invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z
/* if-nez v1, :cond_1 */
/* .line 33 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v1 = "Active Fragments:"; // const-string v1, "Active Fragments:"
/* .line 34 */
(( java.io.PrintWriter ) p3 ).println ( v1 ); // invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
/* .line 35 */
v1 = this.b;
(( java.util.HashMap ) v1 ).values ( ); // invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Lc/l/d/a2; */
/* .line 36 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 37 */
(( c.l.d.a2 ) v2 ).k ( ); // invoke-virtual {v2}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;
/* .line 38 */
(( java.io.PrintWriter ) p3 ).println ( v2 ); // invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
/* .line 39 */
(( androidx.fragment.app.Fragment ) v2 ).a ( v0, p2, p3, p4 ); // invoke-virtual {v2, v0, p2, p3, p4}, Landroidx/fragment/app/Fragment;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
} // :cond_0
final String v2 = "null"; // const-string v2, "null"
/* .line 40 */
(( java.io.PrintWriter ) p3 ).println ( v2 ); // invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
/* .line 41 */
} // :cond_1
p2 = this.a;
p2 = (( java.util.ArrayList ) p2 ).size ( ); // invoke-virtual {p2}, Ljava/util/ArrayList;->size()I
/* if-lez p2, :cond_2 */
/* .line 42 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String p4 = "Added Fragments:"; // const-string p4, "Added Fragments:"
(( java.io.PrintWriter ) p3 ).println ( p4 ); // invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
int p4 = 0; // const/4 p4, 0x0
} // :goto_1
/* if-ge p4, p2, :cond_2 */
/* .line 43 */
v0 = this.a;
(( java.util.ArrayList ) v0 ).get ( p4 ); // invoke-virtual {v0, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroidx/fragment/app/Fragment; */
/* .line 44 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v1 = " #"; // const-string v1, " #"
/* .line 45 */
(( java.io.PrintWriter ) p3 ).print ( v1 ); // invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* .line 46 */
(( java.io.PrintWriter ) p3 ).print ( p4 ); // invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V
final String v1 = ": "; // const-string v1, ": "
/* .line 47 */
(( java.io.PrintWriter ) p3 ).print ( v1 ); // invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* .line 48 */
(( androidx.fragment.app.Fragment ) v0 ).toString ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
/* add-int/lit8 p4, p4, 0x1 */
} // :cond_2
return;
} // .end method
public void a ( java.util.List p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 2 */
v0 = this.a;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 3 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_2
/* check-cast v0, Ljava/lang/String; */
/* .line 4 */
(( c.l.d.c2 ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lc/l/d/c2;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;
if ( v1 != null) { // if-eqz v1, :cond_1
int v2 = 2; // const/4 v2, 0x2
/* .line 5 */
v2 = c.l.d.o1 .d ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 6 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "restoreSaveState: added ("; // const-string v3, "restoreSaveState: added ("
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "): "; // const-string v0, "): "
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v2 = "FragmentManager"; // const-string v2, "FragmentManager"
android.util.Log .v ( v2,v0 );
/* .line 7 */
} // :cond_0
(( c.l.d.c2 ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lc/l/d/c2;->a(Landroidx/fragment/app/Fragment;)V
/* .line 8 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "No instantiated fragment for ("; // const-string v2, "No instantiated fragment for ("
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = ")"; // const-string v0, ")"
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_2
return;
} // .end method
public Boolean a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 30 */
v0 = this.b;
(( java.util.HashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public Integer b ( androidx.fragment.app.Fragment p0 ) {
/* .locals 5 */
/* .line 18 */
v0 = this.H;
int v1 = -1; // const/4 v1, -0x1
/* if-nez v0, :cond_0 */
/* .line 19 */
} // :cond_0
v2 = this.a;
p1 = (( java.util.ArrayList ) v2 ).indexOf ( p1 ); // invoke-virtual {v2, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I
/* add-int/lit8 v2, p1, -0x1 */
} // :goto_0
/* if-ltz v2, :cond_2 */
/* .line 20 */
v3 = this.a;
(( java.util.ArrayList ) v3 ).get ( v2 ); // invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Landroidx/fragment/app/Fragment; */
/* .line 21 */
v4 = this.H;
/* if-ne v4, v0, :cond_1 */
v3 = this.I;
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 22 */
p1 = (( android.view.ViewGroup ) v0 ).indexOfChild ( v3 ); // invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_1
/* add-int/lit8 v2, v2, -0x1 */
} // :cond_2
} // :goto_1
/* add-int/lit8 p1, p1, 0x1 */
/* .line 23 */
v2 = this.a;
v2 = (( java.util.ArrayList ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
/* if-ge p1, v2, :cond_4 */
/* .line 24 */
v2 = this.a;
(( java.util.ArrayList ) v2 ).get ( p1 ); // invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroidx/fragment/app/Fragment; */
/* .line 25 */
v3 = this.H;
/* if-ne v3, v0, :cond_3 */
v2 = this.I;
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 26 */
p1 = (( android.view.ViewGroup ) v0 ).indexOfChild ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I
} // :cond_3
} // :cond_4
} // .end method
public androidx.fragment.app.Fragment b ( Integer p0 ) {
/* .locals 3 */
/* .line 10 */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_1 */
/* .line 11 */
v1 = this.a;
(( java.util.ArrayList ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroidx/fragment/app/Fragment; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 12 */
/* iget v2, v1, Landroidx/fragment/app/Fragment;->x:I */
/* if-ne v2, p1, :cond_0 */
} // :cond_0
/* add-int/lit8 v0, v0, -0x1 */
/* .line 13 */
} // :cond_1
v0 = this.b;
(( java.util.HashMap ) v0 ).values ( ); // invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;
v1 = } // :cond_2
if ( v1 != null) { // if-eqz v1, :cond_3
/* check-cast v1, Lc/l/d/a2; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 14 */
(( c.l.d.a2 ) v1 ).k ( ); // invoke-virtual {v1}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;
/* .line 15 */
/* iget v2, v1, Landroidx/fragment/app/Fragment;->x:I */
/* if-ne v2, p1, :cond_2 */
} // :cond_3
int p1 = 0; // const/4 p1, 0x0
} // .end method
public androidx.fragment.app.Fragment b ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 16 */
v0 = this.b;
(( java.util.HashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Lc/l/d/a2; */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 17 */
(( c.l.d.a2 ) p1 ).k ( ); // invoke-virtual {p1}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.util.List b ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Lc/l/d/a2;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 7 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 8 */
v1 = this.b;
(( java.util.HashMap ) v1 ).values ( ); // invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Lc/l/d/a2; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 9 */
(( java.util.ArrayList ) v0 ).add ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_1
} // .end method
public void b ( c.l.d.a2 p0 ) {
/* .locals 3 */
/* .line 1 */
(( c.l.d.a2 ) p1 ).k ( ); // invoke-virtual {p1}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;
/* .line 2 */
/* iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->C:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v0 = this.c;
(( c.l.d.t1 ) v0 ).e ( p1 ); // invoke-virtual {v0, p1}, Lc/l/d/t1;->e(Landroidx/fragment/app/Fragment;)V
/* .line 4 */
} // :cond_0
v0 = this.b;
v1 = this.g;
int v2 = 0; // const/4 v2, 0x0
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lc/l/d/a2; */
/* if-nez v0, :cond_1 */
return;
} // :cond_1
int v0 = 2; // const/4 v0, 0x2
/* .line 5 */
v0 = c.l.d.o1 .d ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 6 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Removed fragment from active set "; // const-string v1, "Removed fragment from active set "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "FragmentManager"; // const-string v0, "FragmentManager"
android.util.Log .v ( v0,p1 );
} // :cond_2
return;
} // .end method
public androidx.fragment.app.Fragment c ( java.lang.String p0 ) {
/* .locals 3 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 10 */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_1 */
/* .line 11 */
v1 = this.a;
(( java.util.ArrayList ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroidx/fragment/app/Fragment; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 12 */
v2 = this.z;
v2 = (( java.lang.String ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
} // :cond_0
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_1
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 13 */
v0 = this.b;
(( java.util.HashMap ) v0 ).values ( ); // invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;
v1 = } // :cond_2
if ( v1 != null) { // if-eqz v1, :cond_3
/* check-cast v1, Lc/l/d/a2; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 14 */
(( c.l.d.a2 ) v1 ).k ( ); // invoke-virtual {v1}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;
/* .line 15 */
v2 = this.z;
v2 = (( java.lang.String ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_2
} // :cond_3
int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.util.List c ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Landroidx/fragment/app/Fragment;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 6 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 7 */
v1 = this.b;
(( java.util.HashMap ) v1 ).values ( ); // invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Lc/l/d/a2; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 8 */
(( c.l.d.a2 ) v2 ).k ( ); // invoke-virtual {v2}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;
(( java.util.ArrayList ) v0 ).add ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* .line 9 */
(( java.util.ArrayList ) v0 ).add ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_1
} // .end method
public void c ( androidx.fragment.app.Fragment p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
/* monitor-enter v0 */
/* .line 2 */
try { // :try_start_0
v1 = this.a;
(( java.util.ArrayList ) v1 ).remove ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
/* .line 3 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* iput-boolean v0, p1, Landroidx/fragment/app/Fragment;->m:Z */
return;
/* :catchall_0 */
/* move-exception p1 */
/* .line 5 */
try { // :try_start_1
/* monitor-exit v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw p1 */
} // .end method
public androidx.fragment.app.Fragment d ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 6 */
v0 = this.b;
(( java.util.HashMap ) v0 ).values ( ); // invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Lc/l/d/a2; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 7 */
(( c.l.d.a2 ) v1 ).k ( ); // invoke-virtual {v1}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;
/* .line 8 */
(( androidx.fragment.app.Fragment ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Landroidx/fragment/app/Fragment;->a(Ljava/lang/String;)Landroidx/fragment/app/Fragment;
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.util.List d ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Landroidx/fragment/app/Fragment;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
java.util.Collections .emptyList ( );
/* .line 3 */
} // :cond_0
v0 = this.a;
/* monitor-enter v0 */
/* .line 4 */
try { // :try_start_0
/* new-instance v1, Ljava/util/ArrayList; */
v2 = this.a;
/* invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception v1 */
/* .line 5 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
public c.l.d.a2 e ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.b;
(( java.util.HashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Lc/l/d/a2; */
} // .end method
public c.l.d.t1 e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public void f ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.a;
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
} // :cond_0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Landroidx/fragment/app/Fragment; */
/* .line 2 */
v2 = this.b;
v1 = this.g;
(( java.util.HashMap ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Lc/l/d/a2; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
(( c.l.d.a2 ) v1 ).l ( ); // invoke-virtual {v1}, Lc/l/d/a2;->l()V
/* .line 4 */
} // :cond_1
v0 = this.b;
(( java.util.HashMap ) v0 ).values ( ); // invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;
} // :cond_2
v1 = } // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_4
/* check-cast v1, Lc/l/d/a2; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 5 */
(( c.l.d.a2 ) v1 ).l ( ); // invoke-virtual {v1}, Lc/l/d/a2;->l()V
/* .line 6 */
(( c.l.d.a2 ) v1 ).k ( ); // invoke-virtual {v1}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;
/* .line 7 */
/* iget-boolean v3, v2, Landroidx/fragment/app/Fragment;->n:Z */
if ( v3 != null) { // if-eqz v3, :cond_3
v2 = (( androidx.fragment.app.Fragment ) v2 ).T ( ); // invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->T()Z
/* if-nez v2, :cond_3 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_3
int v2 = 0; // const/4 v2, 0x0
} // :goto_2
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 8 */
(( c.l.d.c2 ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Lc/l/d/c2;->b(Lc/l/d/a2;)V
} // :cond_4
return;
} // .end method
public void g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
(( java.util.HashMap ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
return;
} // .end method
public java.util.ArrayList h ( ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/ArrayList<", */
/* "Lc/l/d/x1;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Ljava/util/ArrayList; */
v1 = this.b;
v1 = (( java.util.HashMap ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/HashMap;->size()I
/* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V */
/* .line 2 */
v1 = this.b;
(( java.util.HashMap ) v1 ).values ( ); // invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Lc/l/d/a2; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 3 */
(( c.l.d.a2 ) v2 ).k ( ); // invoke-virtual {v2}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;
/* .line 4 */
(( c.l.d.a2 ) v2 ).q ( ); // invoke-virtual {v2}, Lc/l/d/a2;->q()Lc/l/d/x1;
/* .line 5 */
(( java.util.ArrayList ) v0 ).add ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
int v4 = 2; // const/4 v4, 0x2
/* .line 6 */
v4 = c.l.d.o1 .d ( v4 );
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 7 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Saved state of "; // const-string v5, "Saved state of "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v3 = ": "; // const-string v3, ": "
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.n;
(( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v3 = "FragmentManager"; // const-string v3, "FragmentManager"
android.util.Log .v ( v3,v2 );
} // :cond_1
} // .end method
public java.util.ArrayList i ( ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/ArrayList<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.a;
/* monitor-enter v0 */
/* .line 2 */
try { // :try_start_0
v1 = this.a;
v1 = (( java.util.ArrayList ) v1 ).isEmpty ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
/* monitor-exit v0 */
/* .line 4 */
} // :cond_0
/* new-instance v1, Ljava/util/ArrayList; */
v2 = this.a;
v2 = (( java.util.ArrayList ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
/* invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V */
/* .line 5 */
v2 = this.a;
(( java.util.ArrayList ) v2 ).iterator ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
} // :cond_1
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_2
/* check-cast v3, Landroidx/fragment/app/Fragment; */
/* .line 6 */
v4 = this.g;
(( java.util.ArrayList ) v1 ).add ( v4 ); // invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
int v4 = 2; // const/4 v4, 0x2
/* .line 7 */
v4 = c.l.d.o1 .d ( v4 );
if ( v4 != null) { // if-eqz v4, :cond_1
final String v4 = "FragmentManager"; // const-string v4, "FragmentManager"
/* .line 8 */
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "saveAllState: adding fragment ("; // const-string v6, "saveAllState: adding fragment ("
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v6 = this.g;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = "): "; // const-string v6, "): "
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v4,v3 );
/* .line 9 */
} // :cond_2
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception v1 */
/* .line 10 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method

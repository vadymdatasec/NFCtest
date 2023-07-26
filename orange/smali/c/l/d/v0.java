public class c.l.d.v0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.concurrent.CopyOnWriteArrayList a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/concurrent/CopyOnWriteArrayList<", */
	 /* "Lc/l/d/u0;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final c.l.d.o1 b;
/* # direct methods */
public c.l.d.v0 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList; */
/* invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V */
this.a = v0;
/* .line 3 */
this.b = p1;
return;
} // .end method
/* # virtual methods */
public void a ( androidx.fragment.app.Fragment p0, android.os.Bundle p1, Boolean p2 ) {
/* .locals 3 */
/* .line 9 */
v0 = this.b;
(( c.l.d.o1 ) v0 ).D ( ); // invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 10 */
	 (( androidx.fragment.app.Fragment ) v0 ).z ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;
	 /* .line 11 */
	 (( c.l.d.o1 ) v0 ).C ( ); // invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;
	 int v1 = 1; // const/4 v1, 0x1
	 /* .line 12 */
	 (( c.l.d.v0 ) v0 ).a ( p1, p2, v1 ); // invoke-virtual {v0, p1, p2, v1}, Lc/l/d/v0;->a(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V
	 /* .line 13 */
} // :cond_0
v0 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
} // :cond_1
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_3
/* check-cast v1, Lc/l/d/u0; */
if ( p3 != null) { // if-eqz p3, :cond_2
/* .line 14 */
/* iget-boolean v2, v1, Lc/l/d/u0;->b:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
	 /* .line 15 */
} // :cond_2
v1 = this.a;
v2 = this.b;
(( c.l.d.h1 ) v1 ).a ( v2, p1, p2 ); // invoke-virtual {v1, v2, p1, p2}, Lc/l/d/h1;->a(Lc/l/d/o1;Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V
} // :cond_3
return;
} // .end method
public void a ( androidx.fragment.app.Fragment p0, android.view.View p1, android.os.Bundle p2, Boolean p3 ) {
/* .locals 3 */
/* .line 16 */
v0 = this.b;
(( c.l.d.o1 ) v0 ).D ( ); // invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 17 */
(( androidx.fragment.app.Fragment ) v0 ).z ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;
/* .line 18 */
(( c.l.d.o1 ) v0 ).C ( ); // invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;
int v1 = 1; // const/4 v1, 0x1
/* .line 19 */
(( c.l.d.v0 ) v0 ).a ( p1, p2, p3, v1 ); // invoke-virtual {v0, p1, p2, p3, v1}, Lc/l/d/v0;->a(Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;Z)V
/* .line 20 */
} // :cond_0
v0 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
} // :cond_1
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_3
/* check-cast v1, Lc/l/d/u0; */
if ( p4 != null) { // if-eqz p4, :cond_2
/* .line 21 */
/* iget-boolean v2, v1, Lc/l/d/u0;->b:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 22 */
} // :cond_2
v1 = this.a;
v2 = this.b;
(( c.l.d.h1 ) v1 ).a ( v2, p1, p2, p3 ); // invoke-virtual {v1, v2, p1, p2, p3}, Lc/l/d/h1;->a(Lc/l/d/o1;Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;)V
} // :cond_3
return;
} // .end method
public void a ( androidx.fragment.app.Fragment p0, Boolean p1 ) {
/* .locals 4 */
/* .line 1 */
v0 = this.b;
(( c.l.d.o1 ) v0 ).A ( ); // invoke-virtual {v0}, Lc/l/d/o1;->A()Lc/l/d/r0;
(( c.l.d.r0 ) v0 ).h ( ); // invoke-virtual {v0}, Lc/l/d/r0;->h()Landroid/content/Context;
/* .line 2 */
v1 = this.b;
(( c.l.d.o1 ) v1 ).D ( ); // invoke-virtual {v1}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
(( androidx.fragment.app.Fragment ) v1 ).z ( ); // invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;
/* .line 4 */
(( c.l.d.o1 ) v1 ).C ( ); // invoke-virtual {v1}, Lc/l/d/o1;->C()Lc/l/d/v0;
int v2 = 1; // const/4 v2, 0x1
/* .line 5 */
(( c.l.d.v0 ) v1 ).a ( p1, v2 ); // invoke-virtual {v1, p1, v2}, Lc/l/d/v0;->a(Landroidx/fragment/app/Fragment;Z)V
/* .line 6 */
} // :cond_0
v1 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v1 ).iterator ( ); // invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
} // :cond_1
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_3
/* check-cast v2, Lc/l/d/u0; */
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 7 */
/* iget-boolean v3, v2, Lc/l/d/u0;->b:Z */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 8 */
} // :cond_2
v2 = this.a;
v3 = this.b;
(( c.l.d.h1 ) v2 ).a ( v3, p1, v0 ); // invoke-virtual {v2, v3, p1, v0}, Lc/l/d/h1;->a(Lc/l/d/o1;Landroidx/fragment/app/Fragment;Landroid/content/Context;)V
} // :cond_3
return;
} // .end method
public void b ( androidx.fragment.app.Fragment p0, android.os.Bundle p1, Boolean p2 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
(( c.l.d.o1 ) v0 ).D ( ); // invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( androidx.fragment.app.Fragment ) v0 ).z ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;
/* .line 3 */
(( c.l.d.o1 ) v0 ).C ( ); // invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;
int v1 = 1; // const/4 v1, 0x1
/* .line 4 */
(( c.l.d.v0 ) v0 ).b ( p1, p2, v1 ); // invoke-virtual {v0, p1, p2, v1}, Lc/l/d/v0;->b(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V
/* .line 5 */
} // :cond_0
v0 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
} // :cond_1
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_3
/* check-cast v1, Lc/l/d/u0; */
if ( p3 != null) { // if-eqz p3, :cond_2
/* .line 6 */
/* iget-boolean v2, v1, Lc/l/d/u0;->b:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 7 */
} // :cond_2
v1 = this.a;
v2 = this.b;
(( c.l.d.h1 ) v1 ).b ( v2, p1, p2 ); // invoke-virtual {v1, v2, p1, p2}, Lc/l/d/h1;->b(Lc/l/d/o1;Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V
} // :cond_3
return;
} // .end method
public void b ( androidx.fragment.app.Fragment p0, Boolean p1 ) {
/* .locals 3 */
/* .line 8 */
v0 = this.b;
(( c.l.d.o1 ) v0 ).D ( ); // invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 9 */
(( androidx.fragment.app.Fragment ) v0 ).z ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;
/* .line 10 */
(( c.l.d.o1 ) v0 ).C ( ); // invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;
int v1 = 1; // const/4 v1, 0x1
/* .line 11 */
(( c.l.d.v0 ) v0 ).b ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lc/l/d/v0;->b(Landroidx/fragment/app/Fragment;Z)V
/* .line 12 */
} // :cond_0
v0 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
} // :cond_1
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_3
/* check-cast v1, Lc/l/d/u0; */
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 13 */
/* iget-boolean v2, v1, Lc/l/d/u0;->b:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 14 */
} // :cond_2
v1 = this.a;
v2 = this.b;
(( c.l.d.h1 ) v1 ).a ( v2, p1 ); // invoke-virtual {v1, v2, p1}, Lc/l/d/h1;->a(Lc/l/d/o1;Landroidx/fragment/app/Fragment;)V
} // :cond_3
return;
} // .end method
public void c ( androidx.fragment.app.Fragment p0, android.os.Bundle p1, Boolean p2 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
(( c.l.d.o1 ) v0 ).D ( ); // invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( androidx.fragment.app.Fragment ) v0 ).z ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;
/* .line 3 */
(( c.l.d.o1 ) v0 ).C ( ); // invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;
int v1 = 1; // const/4 v1, 0x1
/* .line 4 */
(( c.l.d.v0 ) v0 ).c ( p1, p2, v1 ); // invoke-virtual {v0, p1, p2, v1}, Lc/l/d/v0;->c(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V
/* .line 5 */
} // :cond_0
v0 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
} // :cond_1
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_3
/* check-cast v1, Lc/l/d/u0; */
if ( p3 != null) { // if-eqz p3, :cond_2
/* .line 6 */
/* iget-boolean v2, v1, Lc/l/d/u0;->b:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 7 */
} // :cond_2
v1 = this.a;
v2 = this.b;
(( c.l.d.h1 ) v1 ).c ( v2, p1, p2 ); // invoke-virtual {v1, v2, p1, p2}, Lc/l/d/h1;->c(Lc/l/d/o1;Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V
} // :cond_3
return;
} // .end method
public void c ( androidx.fragment.app.Fragment p0, Boolean p1 ) {
/* .locals 3 */
/* .line 8 */
v0 = this.b;
(( c.l.d.o1 ) v0 ).D ( ); // invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 9 */
(( androidx.fragment.app.Fragment ) v0 ).z ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;
/* .line 10 */
(( c.l.d.o1 ) v0 ).C ( ); // invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;
int v1 = 1; // const/4 v1, 0x1
/* .line 11 */
(( c.l.d.v0 ) v0 ).c ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lc/l/d/v0;->c(Landroidx/fragment/app/Fragment;Z)V
/* .line 12 */
} // :cond_0
v0 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
} // :cond_1
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_3
/* check-cast v1, Lc/l/d/u0; */
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 13 */
/* iget-boolean v2, v1, Lc/l/d/u0;->b:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 14 */
} // :cond_2
v1 = this.a;
v2 = this.b;
(( c.l.d.h1 ) v1 ).b ( v2, p1 ); // invoke-virtual {v1, v2, p1}, Lc/l/d/h1;->b(Lc/l/d/o1;Landroidx/fragment/app/Fragment;)V
} // :cond_3
return;
} // .end method
public void d ( androidx.fragment.app.Fragment p0, android.os.Bundle p1, Boolean p2 ) {
/* .locals 3 */
/* .line 8 */
v0 = this.b;
(( c.l.d.o1 ) v0 ).D ( ); // invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 9 */
(( androidx.fragment.app.Fragment ) v0 ).z ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;
/* .line 10 */
(( c.l.d.o1 ) v0 ).C ( ); // invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;
int v1 = 1; // const/4 v1, 0x1
/* .line 11 */
(( c.l.d.v0 ) v0 ).d ( p1, p2, v1 ); // invoke-virtual {v0, p1, p2, v1}, Lc/l/d/v0;->d(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V
/* .line 12 */
} // :cond_0
v0 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
} // :cond_1
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_3
/* check-cast v1, Lc/l/d/u0; */
if ( p3 != null) { // if-eqz p3, :cond_2
/* .line 13 */
/* iget-boolean v2, v1, Lc/l/d/u0;->b:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 14 */
} // :cond_2
v1 = this.a;
v2 = this.b;
(( c.l.d.h1 ) v1 ).d ( v2, p1, p2 ); // invoke-virtual {v1, v2, p1, p2}, Lc/l/d/h1;->d(Lc/l/d/o1;Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V
} // :cond_3
return;
} // .end method
public void d ( androidx.fragment.app.Fragment p0, Boolean p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
(( c.l.d.o1 ) v0 ).D ( ); // invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( androidx.fragment.app.Fragment ) v0 ).z ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;
/* .line 3 */
(( c.l.d.o1 ) v0 ).C ( ); // invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;
int v1 = 1; // const/4 v1, 0x1
/* .line 4 */
(( c.l.d.v0 ) v0 ).d ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lc/l/d/v0;->d(Landroidx/fragment/app/Fragment;Z)V
/* .line 5 */
} // :cond_0
v0 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
} // :cond_1
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_3
/* check-cast v1, Lc/l/d/u0; */
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 6 */
/* iget-boolean v2, v1, Lc/l/d/u0;->b:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 7 */
} // :cond_2
v1 = this.a;
v2 = this.b;
(( c.l.d.h1 ) v1 ).c ( v2, p1 ); // invoke-virtual {v1, v2, p1}, Lc/l/d/h1;->c(Lc/l/d/o1;Landroidx/fragment/app/Fragment;)V
} // :cond_3
return;
} // .end method
public void e ( androidx.fragment.app.Fragment p0, Boolean p1 ) {
/* .locals 4 */
/* .line 1 */
v0 = this.b;
(( c.l.d.o1 ) v0 ).A ( ); // invoke-virtual {v0}, Lc/l/d/o1;->A()Lc/l/d/r0;
(( c.l.d.r0 ) v0 ).h ( ); // invoke-virtual {v0}, Lc/l/d/r0;->h()Landroid/content/Context;
/* .line 2 */
v1 = this.b;
(( c.l.d.o1 ) v1 ).D ( ); // invoke-virtual {v1}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
(( androidx.fragment.app.Fragment ) v1 ).z ( ); // invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;
/* .line 4 */
(( c.l.d.o1 ) v1 ).C ( ); // invoke-virtual {v1}, Lc/l/d/o1;->C()Lc/l/d/v0;
int v2 = 1; // const/4 v2, 0x1
/* .line 5 */
(( c.l.d.v0 ) v1 ).e ( p1, v2 ); // invoke-virtual {v1, p1, v2}, Lc/l/d/v0;->e(Landroidx/fragment/app/Fragment;Z)V
/* .line 6 */
} // :cond_0
v1 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v1 ).iterator ( ); // invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
} // :cond_1
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_3
/* check-cast v2, Lc/l/d/u0; */
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 7 */
/* iget-boolean v3, v2, Lc/l/d/u0;->b:Z */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 8 */
} // :cond_2
v2 = this.a;
v3 = this.b;
(( c.l.d.h1 ) v2 ).b ( v3, p1, v0 ); // invoke-virtual {v2, v3, p1, v0}, Lc/l/d/h1;->b(Lc/l/d/o1;Landroidx/fragment/app/Fragment;Landroid/content/Context;)V
} // :cond_3
return;
} // .end method
public void f ( androidx.fragment.app.Fragment p0, Boolean p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
(( c.l.d.o1 ) v0 ).D ( ); // invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( androidx.fragment.app.Fragment ) v0 ).z ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;
/* .line 3 */
(( c.l.d.o1 ) v0 ).C ( ); // invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;
int v1 = 1; // const/4 v1, 0x1
/* .line 4 */
(( c.l.d.v0 ) v0 ).f ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lc/l/d/v0;->f(Landroidx/fragment/app/Fragment;Z)V
/* .line 5 */
} // :cond_0
v0 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
} // :cond_1
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_3
/* check-cast v1, Lc/l/d/u0; */
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 6 */
/* iget-boolean v2, v1, Lc/l/d/u0;->b:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 7 */
} // :cond_2
v1 = this.a;
v2 = this.b;
(( c.l.d.h1 ) v1 ).d ( v2, p1 ); // invoke-virtual {v1, v2, p1}, Lc/l/d/h1;->d(Lc/l/d/o1;Landroidx/fragment/app/Fragment;)V
} // :cond_3
return;
} // .end method
public void g ( androidx.fragment.app.Fragment p0, Boolean p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
(( c.l.d.o1 ) v0 ).D ( ); // invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( androidx.fragment.app.Fragment ) v0 ).z ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;
/* .line 3 */
(( c.l.d.o1 ) v0 ).C ( ); // invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;
int v1 = 1; // const/4 v1, 0x1
/* .line 4 */
(( c.l.d.v0 ) v0 ).g ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lc/l/d/v0;->g(Landroidx/fragment/app/Fragment;Z)V
/* .line 5 */
} // :cond_0
v0 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
} // :cond_1
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_3
/* check-cast v1, Lc/l/d/u0; */
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 6 */
/* iget-boolean v2, v1, Lc/l/d/u0;->b:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 7 */
} // :cond_2
v1 = this.a;
v2 = this.b;
(( c.l.d.h1 ) v1 ).e ( v2, p1 ); // invoke-virtual {v1, v2, p1}, Lc/l/d/h1;->e(Lc/l/d/o1;Landroidx/fragment/app/Fragment;)V
} // :cond_3
return;
} // .end method
public void h ( androidx.fragment.app.Fragment p0, Boolean p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
(( c.l.d.o1 ) v0 ).D ( ); // invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( androidx.fragment.app.Fragment ) v0 ).z ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;
/* .line 3 */
(( c.l.d.o1 ) v0 ).C ( ); // invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;
int v1 = 1; // const/4 v1, 0x1
/* .line 4 */
(( c.l.d.v0 ) v0 ).h ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lc/l/d/v0;->h(Landroidx/fragment/app/Fragment;Z)V
/* .line 5 */
} // :cond_0
v0 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
} // :cond_1
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_3
/* check-cast v1, Lc/l/d/u0; */
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 6 */
/* iget-boolean v2, v1, Lc/l/d/u0;->b:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 7 */
} // :cond_2
v1 = this.a;
v2 = this.b;
(( c.l.d.h1 ) v1 ).f ( v2, p1 ); // invoke-virtual {v1, v2, p1}, Lc/l/d/h1;->f(Lc/l/d/o1;Landroidx/fragment/app/Fragment;)V
} // :cond_3
return;
} // .end method
public void i ( androidx.fragment.app.Fragment p0, Boolean p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
(( c.l.d.o1 ) v0 ).D ( ); // invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( androidx.fragment.app.Fragment ) v0 ).z ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;
/* .line 3 */
(( c.l.d.o1 ) v0 ).C ( ); // invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;
int v1 = 1; // const/4 v1, 0x1
/* .line 4 */
(( c.l.d.v0 ) v0 ).i ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lc/l/d/v0;->i(Landroidx/fragment/app/Fragment;Z)V
/* .line 5 */
} // :cond_0
v0 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
} // :cond_1
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_3
/* check-cast v1, Lc/l/d/u0; */
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 6 */
/* iget-boolean v2, v1, Lc/l/d/u0;->b:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 7 */
} // :cond_2
v1 = this.a;
v2 = this.b;
(( c.l.d.h1 ) v1 ).g ( v2, p1 ); // invoke-virtual {v1, v2, p1}, Lc/l/d/h1;->g(Lc/l/d/o1;Landroidx/fragment/app/Fragment;)V
} // :cond_3
return;
} // .end method

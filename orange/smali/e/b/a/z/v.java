public class e.b.a.z.v implements android.os.Handler$Callback {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Le/b/a/z/v$a; */
	 /* } */
} // .end annotation
/* # static fields */
public static final e.b.a.z.v$a k;
/* # instance fields */
public volatile e.b.a.u a;
public final java.util.Map b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Landroid/app/FragmentManager;", */
/* "Le/b/a/z/t;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final java.util.Map c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Lc/l/d/o1;", */
/* "Le/b/a/z/l0;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final android.os.Handler d;
public final e.b.a.z.v$a e;
public final c.e.b f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/e/b<", */
/* "Landroid/view/View;", */
/* "Landroidx/fragment/app/Fragment;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final c.e.b g;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/e/b<", */
/* "Landroid/view/View;", */
/* "Landroid/app/Fragment;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final android.os.Bundle h;
public final e.b.a.z.l i;
public final e.b.a.z.q j;
/* # direct methods */
public static e.b.a.z.v ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Le/b/a/z/u; */
/* invoke-direct {v0}, Le/b/a/z/u;-><init>()V */
return;
} // .end method
public e.b.a.z.v ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.b = v0;
/* .line 3 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.c = v0;
/* .line 4 */
/* new-instance v0, Lc/e/b; */
/* invoke-direct {v0}, Lc/e/b;-><init>()V */
this.f = v0;
/* .line 5 */
/* new-instance v0, Lc/e/b; */
/* invoke-direct {v0}, Lc/e/b;-><init>()V */
this.g = v0;
/* .line 6 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
this.h = v0;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 7 */
} // :cond_0
p1 = e.b.a.z.v.k;
} // :goto_0
this.e = p1;
/* .line 8 */
/* new-instance p1, Landroid/os/Handler; */
android.os.Looper .getMainLooper ( );
/* invoke-direct {p1, v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V */
this.d = p1;
/* .line 9 */
/* new-instance p1, Le/b/a/z/q; */
v0 = this.e;
/* invoke-direct {p1, v0}, Le/b/a/z/q;-><init>(Le/b/a/z/v$a;)V */
this.j = p1;
/* .line 10 */
e.b.a.z.v .a ( p2 );
this.i = p1;
return;
} // .end method
public static e.b.a.z.l a ( Object p0 ) {
/* .locals 1 */
/* .line 1 */
/* sget-boolean v0, Le/b/a/y/z/e/d0;->h:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* sget-boolean v0, Le/b/a/y/z/e/d0;->g:Z */
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
/* const-class v0, Le/b/a/h; */
p0 = (( e.b.a.l ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/b/a/l;->a(Ljava/lang/Class;)Z
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 3 */
/* new-instance p0, Le/b/a/z/j; */
/* invoke-direct {p0}, Le/b/a/z/j;-><init>()V */
/* .line 4 */
} // :cond_1
/* new-instance p0, Le/b/a/z/k; */
/* invoke-direct {p0}, Le/b/a/z/k;-><init>()V */
} // :goto_0
/* .line 5 */
} // :cond_2
} // :goto_1
/* new-instance p0, Le/b/a/z/h; */
/* invoke-direct {p0}, Le/b/a/z/h;-><init>()V */
} // .end method
public static void a ( java.util.Collection p0, java.util.Map p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Collection<", */
/* "Landroidx/fragment/app/Fragment;", */
/* ">;", */
/* "Ljava/util/Map<", */
/* "Landroid/view/View;", */
/* "Landroidx/fragment/app/Fragment;", */
/* ">;)V" */
/* } */
} // .end annotation
/* if-nez p0, :cond_0 */
return;
/* .line 59 */
} // :cond_0
} // :cond_1
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_3
/* check-cast v0, Landroidx/fragment/app/Fragment; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 60 */
(( androidx.fragment.app.Fragment ) v0 ).M ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->M()Landroid/view/View;
/* if-nez v1, :cond_2 */
/* .line 61 */
} // :cond_2
(( androidx.fragment.app.Fragment ) v0 ).M ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->M()Landroid/view/View;
/* .line 62 */
(( androidx.fragment.app.Fragment ) v0 ).l ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->l()Lc/l/d/o1;
(( c.l.d.o1 ) v0 ).z ( ); // invoke-virtual {v0}, Lc/l/d/o1;->z()Ljava/util/List;
e.b.a.z.v .a ( v0,p1 );
} // :cond_3
return;
} // .end method
public static android.app.Activity c ( android.content.Context p0 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of v0, p0, Landroid/app/Activity; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* check-cast p0, Landroid/app/Activity; */
/* .line 3 */
} // :cond_0
/* instance-of v0, p0, Landroid/content/ContextWrapper; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
/* check-cast p0, Landroid/content/ContextWrapper; */
(( android.content.ContextWrapper ) p0 ).getBaseContext ( ); // invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;
e.b.a.z.v .c ( p0 );
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static void c ( android.app.Activity p0 ) {
/* .locals 2 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x11 */
} // .end annotation
/* .line 5 */
/* const/16 v1, 0x11 */
/* if-lt v0, v1, :cond_1 */
p0 = (( android.app.Activity ) p0 ).isDestroyed ( ); // invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z
/* if-nez p0, :cond_0 */
/* .line 6 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String v0 = "You cannot start a load for a destroyed activity"; // const-string v0, "You cannot start a load for a destroyed activity"
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // :cond_1
} // :goto_0
return;
} // .end method
public static Boolean d ( android.content.Context p0 ) {
/* .locals 0 */
/* .line 1 */
e.b.a.z.v .c ( p0 );
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 2 */
p0 = (( android.app.Activity ) p0 ).isFinishing ( ); // invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z
/* if-nez p0, :cond_0 */
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :cond_1
} // :goto_0
int p0 = 1; // const/4 p0, 0x1
} // :goto_1
} // .end method
/* # virtual methods */
public final android.app.Fragment a ( android.view.View p0, android.app.Activity p1 ) {
/* .locals 2 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 72 */
v0 = this.g;
(( c.e.i ) v0 ).clear ( ); // invoke-virtual {v0}, Lc/e/i;->clear()V
/* .line 73 */
(( android.app.Activity ) p2 ).getFragmentManager ( ); // invoke-virtual {p2}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;
v1 = this.g;
(( e.b.a.z.v ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/b/a/z/v;->a(Landroid/app/FragmentManager;Lc/e/b;)V
/* const v0, 0x1020002 */
/* .line 74 */
(( android.app.Activity ) p2 ).findViewById ( v0 ); // invoke-virtual {p2, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;
int v0 = 0; // const/4 v0, 0x0
/* .line 75 */
} // :goto_0
v1 = (( java.lang.Object ) p1 ).equals ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_1 */
/* .line 76 */
v0 = this.g;
(( c.e.i ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Landroid/app/Fragment; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 77 */
} // :cond_0
(( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* instance-of v1, v1, Landroid/view/View; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 78 */
(( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* check-cast p1, Landroid/view/View; */
/* .line 79 */
} // :cond_1
} // :goto_1
p1 = this.g;
(( c.e.i ) p1 ).clear ( ); // invoke-virtual {p1}, Lc/e/i;->clear()V
} // .end method
public final androidx.fragment.app.Fragment a ( android.view.View p0, c.l.d.f0 p1 ) {
/* .locals 2 */
/* .line 63 */
v0 = this.f;
(( c.e.i ) v0 ).clear ( ); // invoke-virtual {v0}, Lc/e/i;->clear()V
/* .line 64 */
(( c.l.d.f0 ) p2 ).j ( ); // invoke-virtual {p2}, Lc/l/d/f0;->j()Lc/l/d/o1;
(( c.l.d.o1 ) v0 ).z ( ); // invoke-virtual {v0}, Lc/l/d/o1;->z()Ljava/util/List;
v1 = this.f;
/* .line 65 */
e.b.a.z.v .a ( v0,v1 );
/* const v0, 0x1020002 */
/* .line 66 */
(( android.app.Activity ) p2 ).findViewById ( v0 ); // invoke-virtual {p2, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;
int v0 = 0; // const/4 v0, 0x0
/* .line 67 */
} // :goto_0
v1 = (( java.lang.Object ) p1 ).equals ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_1 */
/* .line 68 */
v0 = this.f;
(( c.e.i ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Landroidx/fragment/app/Fragment; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 69 */
} // :cond_0
(( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* instance-of v1, v1, Landroid/view/View; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 70 */
(( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* check-cast p1, Landroid/view/View; */
/* .line 71 */
} // :cond_1
} // :goto_1
p1 = this.f;
(( c.e.i ) p1 ).clear ( ); // invoke-virtual {p1}, Lc/e/i;->clear()V
} // .end method
public e.b.a.u a ( android.app.Activity p0 ) {
/* .locals 3 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 38 */
v0 = e.b.a.e0.t .d ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 39 */
(( android.app.Activity ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
(( e.b.a.z.v ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Landroid/content/Context;)Le/b/a/u;
/* .line 40 */
} // :cond_0
/* instance-of v0, p1, Lc/l/d/f0; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 41 */
/* check-cast p1, Lc/l/d/f0; */
(( e.b.a.z.v ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Lc/l/d/f0;)Le/b/a/u;
/* .line 42 */
} // :cond_1
e.b.a.z.v .c ( p1 );
/* .line 43 */
v0 = this.i;
/* .line 44 */
(( android.app.Activity ) p1 ).getFragmentManager ( ); // invoke-virtual {p1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;
int v1 = 0; // const/4 v1, 0x0
/* .line 45 */
v2 = e.b.a.z.v .d ( p1 );
(( e.b.a.z.v ) p0 ).a ( p1, v0, v1, v2 ); // invoke-virtual {p0, p1, v0, v1, v2}, Le/b/a/z/v;->a(Landroid/content/Context;Landroid/app/FragmentManager;Landroid/app/Fragment;Z)Le/b/a/u;
} // .end method
public e.b.a.u a ( android.app.Fragment p0 ) {
/* .locals 3 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x11 */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 86 */
(( android.app.Fragment ) p1 ).getActivity ( ); // invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 87 */
v0 = e.b.a.e0.t .d ( );
/* if-nez v0, :cond_2 */
/* const/16 v1, 0x11 */
/* if-ge v0, v1, :cond_0 */
/* .line 88 */
} // :cond_0
(( android.app.Fragment ) p1 ).getActivity ( ); // invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 89 */
v0 = this.i;
(( android.app.Fragment ) p1 ).getActivity ( ); // invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;
/* .line 90 */
} // :cond_1
(( android.app.Fragment ) p1 ).getChildFragmentManager ( ); // invoke-virtual {p1}, Landroid/app/Fragment;->getChildFragmentManager()Landroid/app/FragmentManager;
/* .line 91 */
(( android.app.Fragment ) p1 ).getActivity ( ); // invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;
v2 = (( android.app.Fragment ) p1 ).isVisible ( ); // invoke-virtual {p1}, Landroid/app/Fragment;->isVisible()Z
(( e.b.a.z.v ) p0 ).a ( v1, v0, p1, v2 ); // invoke-virtual {p0, v1, v0, p1, v2}, Le/b/a/z/v;->a(Landroid/content/Context;Landroid/app/FragmentManager;Landroid/app/Fragment;Z)Le/b/a/u;
/* .line 92 */
} // :cond_2
} // :goto_0
(( android.app.Fragment ) p1 ).getActivity ( ); // invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;
(( android.app.Activity ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
(( e.b.a.z.v ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Landroid/content/Context;)Le/b/a/u;
/* .line 93 */
} // :cond_3
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "You cannot start a load on a fragment before it is attached"; // const-string v0, "You cannot start a load on a fragment before it is attached"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public e.b.a.u a ( android.content.Context p0 ) {
/* .locals 2 */
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 6 */
v0 = e.b.a.e0.t .e ( );
if ( v0 != null) { // if-eqz v0, :cond_2
/* instance-of v0, p1, Landroid/app/Application; */
/* if-nez v0, :cond_2 */
/* .line 7 */
/* instance-of v0, p1, Lc/l/d/f0; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 8 */
/* check-cast p1, Lc/l/d/f0; */
(( e.b.a.z.v ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Lc/l/d/f0;)Le/b/a/u;
/* .line 9 */
} // :cond_0
/* instance-of v0, p1, Landroid/app/Activity; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 10 */
/* check-cast p1, Landroid/app/Activity; */
(( e.b.a.z.v ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Landroid/app/Activity;)Le/b/a/u;
/* .line 11 */
} // :cond_1
/* instance-of v0, p1, Landroid/content/ContextWrapper; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* move-object v0, p1 */
/* check-cast v0, Landroid/content/ContextWrapper; */
/* .line 12 */
(( android.content.ContextWrapper ) v0 ).getBaseContext ( ); // invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;
(( android.content.Context ) v1 ).getApplicationContext ( ); // invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 13 */
(( android.content.ContextWrapper ) v0 ).getBaseContext ( ); // invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;
(( e.b.a.z.v ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Landroid/content/Context;)Le/b/a/u;
/* .line 14 */
} // :cond_2
(( e.b.a.z.v ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/z/v;->b(Landroid/content/Context;)Le/b/a/u;
/* .line 15 */
} // :cond_3
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "You cannot start a load on a null Context"; // const-string v0, "You cannot start a load on a null Context"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final e.b.a.u a ( android.content.Context p0, android.app.FragmentManager p1, android.app.Fragment p2, Boolean p3 ) {
/* .locals 3 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 101 */
(( e.b.a.z.v ) p0 ).a ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Le/b/a/z/v;->a(Landroid/app/FragmentManager;Landroid/app/Fragment;)Le/b/a/z/t;
/* .line 102 */
(( e.b.a.z.t ) p2 ).d ( ); // invoke-virtual {p2}, Le/b/a/z/t;->d()Le/b/a/u;
/* if-nez p3, :cond_1 */
/* .line 103 */
e.b.a.d .a ( p1 );
/* .line 104 */
v0 = this.e;
/* .line 105 */
(( e.b.a.z.t ) p2 ).b ( ); // invoke-virtual {p2}, Le/b/a/z/t;->b()Le/b/a/z/a;
(( e.b.a.z.t ) p2 ).e ( ); // invoke-virtual {p2}, Le/b/a/z/t;->e()Le/b/a/z/w;
/* .line 106 */
if ( p4 != null) { // if-eqz p4, :cond_0
/* .line 107 */
(( e.b.a.u ) p3 ).a ( ); // invoke-virtual {p3}, Le/b/a/u;->a()V
/* .line 108 */
} // :cond_0
(( e.b.a.z.t ) p2 ).a ( p3 ); // invoke-virtual {p2, p3}, Le/b/a/z/t;->a(Le/b/a/u;)V
} // :cond_1
} // .end method
public e.b.a.u a ( android.view.View p0 ) {
/* .locals 2 */
/* .line 46 */
v0 = e.b.a.e0.t .d ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 47 */
(( android.view.View ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
(( e.b.a.z.v ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Landroid/content/Context;)Le/b/a/u;
/* .line 48 */
} // :cond_0
e.b.a.e0.r .a ( p1 );
/* .line 49 */
(( android.view.View ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
final String v1 = "Unable to obtain a request manager for a view without a Context"; // const-string v1, "Unable to obtain a request manager for a view without a Context"
/* .line 50 */
e.b.a.e0.r .a ( v0,v1 );
/* .line 51 */
(( android.view.View ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
e.b.a.z.v .c ( v0 );
/* if-nez v0, :cond_1 */
/* .line 52 */
(( android.view.View ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
(( e.b.a.z.v ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Landroid/content/Context;)Le/b/a/u;
/* .line 53 */
} // :cond_1
/* instance-of v1, v0, Lc/l/d/f0; */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 54 */
/* check-cast v0, Lc/l/d/f0; */
(( e.b.a.z.v ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/b/a/z/v;->a(Landroid/view/View;Lc/l/d/f0;)Landroidx/fragment/app/Fragment;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 55 */
(( e.b.a.z.v ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Landroidx/fragment/app/Fragment;)Le/b/a/u;
} // :cond_2
(( e.b.a.z.v ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/b/a/z/v;->a(Lc/l/d/f0;)Le/b/a/u;
} // :goto_0
/* .line 56 */
} // :cond_3
(( e.b.a.z.v ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/b/a/z/v;->a(Landroid/view/View;Landroid/app/Activity;)Landroid/app/Fragment;
/* if-nez p1, :cond_4 */
/* .line 57 */
(( e.b.a.z.v ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/b/a/z/v;->a(Landroid/app/Activity;)Le/b/a/u;
/* .line 58 */
} // :cond_4
(( e.b.a.z.v ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Landroid/app/Fragment;)Le/b/a/u;
} // .end method
public e.b.a.u a ( androidx.fragment.app.Fragment p0 ) {
/* .locals 8 */
/* .line 26 */
(( androidx.fragment.app.Fragment ) p1 ).m ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->m()Landroid/content/Context;
final String v1 = "You cannot start a load on a fragment before it is attached or after it is destroyed"; // const-string v1, "You cannot start a load on a fragment before it is attached or after it is destroyed"
/* .line 27 */
e.b.a.e0.r .a ( v0,v1 );
/* .line 28 */
v0 = e.b.a.e0.t .d ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 29 */
(( androidx.fragment.app.Fragment ) p1 ).m ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->m()Landroid/content/Context;
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
(( e.b.a.z.v ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Landroid/content/Context;)Le/b/a/u;
/* .line 30 */
} // :cond_0
(( androidx.fragment.app.Fragment ) p1 ).e ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->e()Lc/l/d/f0;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 31 */
v0 = this.i;
(( androidx.fragment.app.Fragment ) p1 ).e ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->e()Lc/l/d/f0;
/* .line 32 */
} // :cond_1
(( androidx.fragment.app.Fragment ) p1 ).l ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->l()Lc/l/d/o1;
/* .line 33 */
(( androidx.fragment.app.Fragment ) p1 ).m ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->m()Landroid/content/Context;
/* .line 34 */
(( android.content.Context ) v3 ).getApplicationContext ( ); // invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
e.b.a.d .a ( v0 );
/* .line 35 */
v2 = this.j;
/* .line 36 */
(( androidx.fragment.app.Fragment ) p1 ).g ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->g()Lc/n/g;
v7 = (( androidx.fragment.app.Fragment ) p1 ).Z ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->Z()Z
/* .line 37 */
/* invoke-virtual/range {v2 ..v7}, Le/b/a/z/q;->a(Landroid/content/Context;Le/b/a/d;Lc/n/g;Lc/l/d/o1;Z)Le/b/a/u; */
} // .end method
public e.b.a.u a ( c.l.d.f0 p0 ) {
/* .locals 7 */
/* .line 16 */
v0 = e.b.a.e0.t .d ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 17 */
(( android.app.Activity ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
(( e.b.a.z.v ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Landroid/content/Context;)Le/b/a/u;
/* .line 18 */
} // :cond_0
e.b.a.z.v .c ( p1 );
/* .line 19 */
v0 = this.i;
/* .line 20 */
v6 = e.b.a.z.v .d ( p1 );
/* .line 21 */
(( android.app.Activity ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
e.b.a.d .a ( v0 );
/* .line 22 */
v1 = this.j;
/* .line 23 */
(( androidx.activity.ComponentActivity ) p1 ).g ( ); // invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->g()Lc/n/g;
/* .line 24 */
(( c.l.d.f0 ) p1 ).j ( ); // invoke-virtual {p1}, Lc/l/d/f0;->j()Lc/l/d/o1;
/* move-object v2, p1 */
/* .line 25 */
/* invoke-virtual/range {v1 ..v6}, Le/b/a/z/q;->a(Landroid/content/Context;Le/b/a/d;Lc/n/g;Lc/l/d/o1;Z)Le/b/a/u; */
} // .end method
public e.b.a.z.l0 a ( c.l.d.o1 p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 109 */
(( e.b.a.z.v ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/b/a/z/v;->a(Lc/l/d/o1;Landroidx/fragment/app/Fragment;)Le/b/a/z/l0;
} // .end method
public final e.b.a.z.l0 a ( c.l.d.o1 p0, androidx.fragment.app.Fragment p1 ) {
/* .locals 2 */
/* .line 110 */
v0 = this.c;
/* check-cast v0, Le/b/a/z/l0; */
/* if-nez v0, :cond_1 */
final String v0 = "com.bumptech.glide.manager"; // const-string v0, "com.bumptech.glide.manager"
/* .line 111 */
(( c.l.d.o1 ) p1 ).c ( v0 ); // invoke-virtual {p1, v0}, Lc/l/d/o1;->c(Ljava/lang/String;)Landroidx/fragment/app/Fragment;
/* check-cast v1, Le/b/a/z/l0; */
/* if-nez v1, :cond_0 */
/* .line 112 */
/* new-instance v1, Le/b/a/z/l0; */
/* invoke-direct {v1}, Le/b/a/z/l0;-><init>()V */
/* .line 113 */
(( e.b.a.z.l0 ) v1 ).c ( p2 ); // invoke-virtual {v1, p2}, Le/b/a/z/l0;->c(Landroidx/fragment/app/Fragment;)V
/* .line 114 */
p2 = this.c;
/* .line 115 */
(( c.l.d.o1 ) p1 ).b ( ); // invoke-virtual {p1}, Lc/l/d/o1;->b()Lc/l/d/e2;
(( c.l.d.e2 ) p2 ).a ( v1, v0 ); // invoke-virtual {p2, v1, v0}, Lc/l/d/e2;->a(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Lc/l/d/e2;
(( c.l.d.e2 ) p2 ).b ( ); // invoke-virtual {p2}, Lc/l/d/e2;->b()I
/* .line 116 */
p2 = this.d;
int v0 = 2; // const/4 v0, 0x2
(( android.os.Handler ) p2 ).obtainMessage ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
(( android.os.Message ) p1 ).sendToTarget ( ); // invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V
} // :cond_0
/* move-object v0, v1 */
} // :cond_1
} // .end method
public final e.b.a.z.t a ( android.app.FragmentManager p0, android.app.Fragment p1 ) {
/* .locals 2 */
/* .line 94 */
v0 = this.b;
/* check-cast v0, Le/b/a/z/t; */
/* if-nez v0, :cond_1 */
final String v0 = "com.bumptech.glide.manager"; // const-string v0, "com.bumptech.glide.manager"
/* .line 95 */
(( android.app.FragmentManager ) p1 ).findFragmentByTag ( v0 ); // invoke-virtual {p1, v0}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;
/* check-cast v1, Le/b/a/z/t; */
/* if-nez v1, :cond_0 */
/* .line 96 */
/* new-instance v1, Le/b/a/z/t; */
/* invoke-direct {v1}, Le/b/a/z/t;-><init>()V */
/* .line 97 */
(( e.b.a.z.t ) v1 ).b ( p2 ); // invoke-virtual {v1, p2}, Le/b/a/z/t;->b(Landroid/app/Fragment;)V
/* .line 98 */
p2 = this.b;
/* .line 99 */
(( android.app.FragmentManager ) p1 ).beginTransaction ( ); // invoke-virtual {p1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;
(( android.app.FragmentTransaction ) p2 ).add ( v1, v0 ); // invoke-virtual {p2, v1, v0}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;
(( android.app.FragmentTransaction ) p2 ).commitAllowingStateLoss ( ); // invoke-virtual {p2}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I
/* .line 100 */
p2 = this.d;
int v0 = 1; // const/4 v0, 0x1
(( android.os.Handler ) p2 ).obtainMessage ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
(( android.os.Message ) p1 ).sendToTarget ( ); // invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V
} // :cond_0
/* move-object v0, v1 */
} // :cond_1
} // .end method
public final void a ( android.app.FragmentManager p0, Object p1 ) {
/* .locals 2 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x1a */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/app/FragmentManager;", */
/* "Lc/e/b<", */
/* "Landroid/view/View;", */
/* "Landroid/app/Fragment;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 80 */
/* const/16 v1, 0x1a */
/* if-lt v0, v1, :cond_1 */
/* .line 81 */
(( android.app.FragmentManager ) p1 ).getFragments ( ); // invoke-virtual {p1}, Landroid/app/FragmentManager;->getFragments()Ljava/util/List;
} // :cond_0
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_2
/* check-cast v0, Landroid/app/Fragment; */
/* .line 82 */
(( android.app.Fragment ) v0 ).getView ( ); // invoke-virtual {v0}, Landroid/app/Fragment;->getView()Landroid/view/View;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 83 */
(( android.app.Fragment ) v0 ).getView ( ); // invoke-virtual {v0}, Landroid/app/Fragment;->getView()Landroid/view/View;
(( c.e.i ) p2 ).put ( v1, v0 ); // invoke-virtual {p2, v1, v0}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 84 */
(( android.app.Fragment ) v0 ).getChildFragmentManager ( ); // invoke-virtual {v0}, Landroid/app/Fragment;->getChildFragmentManager()Landroid/app/FragmentManager;
(( e.b.a.z.v ) p0 ).a ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Le/b/a/z/v;->a(Landroid/app/FragmentManager;Lc/e/b;)V
/* .line 85 */
} // :cond_1
(( e.b.a.z.v ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/b/a/z/v;->b(Landroid/app/FragmentManager;Lc/e/b;)V
} // :cond_2
return;
} // .end method
public final Boolean a ( android.app.FragmentManager p0, Boolean p1 ) {
/* .locals 5 */
/* .line 117 */
v0 = this.b;
/* .line 118 */
/* check-cast v0, Le/b/a/z/t; */
final String v1 = "com.bumptech.glide.manager"; // const-string v1, "com.bumptech.glide.manager"
/* .line 119 */
(( android.app.FragmentManager ) p1 ).findFragmentByTag ( v1 ); // invoke-virtual {p1, v1}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;
/* check-cast v2, Le/b/a/z/t; */
int v3 = 1; // const/4 v3, 0x1
/* if-ne v2, v0, :cond_0 */
} // :cond_0
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 120 */
(( e.b.a.z.t ) v2 ).d ( ); // invoke-virtual {v2}, Le/b/a/z/t;->d()Le/b/a/u;
/* if-nez v4, :cond_1 */
/* .line 121 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "We\'ve added two fragments with requests! Old: "; // const-string v1, "We\'ve added two fragments with requests! Old: "
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = " New: "; // const-string v1, " New: "
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_2
} // :goto_0
final String v4 = "RMRetriever"; // const-string v4, "RMRetriever"
/* if-nez p2, :cond_6 */
/* .line 122 */
p2 = (( android.app.FragmentManager ) p1 ).isDestroyed ( ); // invoke-virtual {p1}, Landroid/app/FragmentManager;->isDestroyed()Z
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 123 */
} // :cond_3
(( android.app.FragmentManager ) p1 ).beginTransaction ( ); // invoke-virtual {p1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;
(( android.app.FragmentTransaction ) p2 ).add ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 124 */
(( android.app.FragmentTransaction ) p2 ).remove ( v2 ); // invoke-virtual {p2, v2}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;
/* .line 125 */
} // :cond_4
(( android.app.FragmentTransaction ) p2 ).commitAllowingStateLoss ( ); // invoke-virtual {p2}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I
/* .line 126 */
p2 = this.d;
int v0 = 0; // const/4 v0, 0x0
/* .line 127 */
(( android.os.Handler ) p2 ).obtainMessage ( v3, v3, v0, p1 ); // invoke-virtual {p2, v3, v3, v0, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;
/* .line 128 */
(( android.os.Message ) p1 ).sendToTarget ( ); // invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V
int p1 = 3; // const/4 p1, 0x3
/* .line 129 */
p1 = android.util.Log .isLoggable ( v4,p1 );
if ( p1 != null) { // if-eqz p1, :cond_5
final String p1 = "We failed to add our Fragment the first time around, trying again..."; // const-string p1, "We failed to add our Fragment the first time around, trying again..."
/* .line 130 */
android.util.Log .d ( v4,p1 );
} // :cond_5
} // :cond_6
} // :goto_1
int p2 = 5; // const/4 p2, 0x5
/* .line 131 */
p2 = android.util.Log .isLoggable ( v4,p2 );
if ( p2 != null) { // if-eqz p2, :cond_8
/* .line 132 */
p1 = (( android.app.FragmentManager ) p1 ).isDestroyed ( ); // invoke-virtual {p1}, Landroid/app/FragmentManager;->isDestroyed()Z
if ( p1 != null) { // if-eqz p1, :cond_7
final String p1 = "Parent was destroyed before our Fragment could be added"; // const-string p1, "Parent was destroyed before our Fragment could be added"
/* .line 133 */
android.util.Log .w ( v4,p1 );
} // :cond_7
final String p1 = "Tried adding Fragment twice and failed twice, giving up!"; // const-string p1, "Tried adding Fragment twice and failed twice, giving up!"
/* .line 134 */
android.util.Log .w ( v4,p1 );
/* .line 135 */
} // :cond_8
} // :goto_2
(( e.b.a.z.t ) v0 ).b ( ); // invoke-virtual {v0}, Le/b/a/z/t;->b()Le/b/a/z/a;
(( e.b.a.z.a ) p1 ).a ( ); // invoke-virtual {p1}, Le/b/a/z/a;->a()V
} // .end method
public final Boolean a ( c.l.d.o1 p0, Boolean p1 ) {
/* .locals 5 */
/* .line 136 */
v0 = this.c;
/* .line 137 */
/* check-cast v0, Le/b/a/z/l0; */
final String v1 = "com.bumptech.glide.manager"; // const-string v1, "com.bumptech.glide.manager"
/* .line 138 */
(( c.l.d.o1 ) p1 ).c ( v1 ); // invoke-virtual {p1, v1}, Lc/l/d/o1;->c(Ljava/lang/String;)Landroidx/fragment/app/Fragment;
/* check-cast v2, Le/b/a/z/l0; */
int v3 = 1; // const/4 v3, 0x1
/* if-ne v2, v0, :cond_0 */
} // :cond_0
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 139 */
(( e.b.a.z.l0 ) v2 ).C0 ( ); // invoke-virtual {v2}, Le/b/a/z/l0;->C0()Le/b/a/u;
/* if-nez v4, :cond_1 */
/* .line 140 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "We\'ve added two fragments with requests! Old: "; // const-string v1, "We\'ve added two fragments with requests! Old: "
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = " New: "; // const-string v1, " New: "
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_2
} // :goto_0
final String v4 = "RMRetriever"; // const-string v4, "RMRetriever"
/* if-nez p2, :cond_6 */
/* .line 141 */
p2 = (( c.l.d.o1 ) p1 ).H ( ); // invoke-virtual {p1}, Lc/l/d/o1;->H()Z
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 142 */
} // :cond_3
(( c.l.d.o1 ) p1 ).b ( ); // invoke-virtual {p1}, Lc/l/d/o1;->b()Lc/l/d/e2;
(( c.l.d.e2 ) p2 ).a ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Lc/l/d/e2;->a(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Lc/l/d/e2;
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 143 */
(( c.l.d.e2 ) p2 ).a ( v2 ); // invoke-virtual {p2, v2}, Lc/l/d/e2;->a(Landroidx/fragment/app/Fragment;)Lc/l/d/e2;
/* .line 144 */
} // :cond_4
(( c.l.d.e2 ) p2 ).c ( ); // invoke-virtual {p2}, Lc/l/d/e2;->c()V
/* .line 145 */
p2 = this.d;
int v0 = 2; // const/4 v0, 0x2
int v1 = 0; // const/4 v1, 0x0
/* .line 146 */
(( android.os.Handler ) p2 ).obtainMessage ( v0, v3, v1, p1 ); // invoke-virtual {p2, v0, v3, v1, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;
/* .line 147 */
(( android.os.Message ) p1 ).sendToTarget ( ); // invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V
int p1 = 3; // const/4 p1, 0x3
/* .line 148 */
p1 = android.util.Log .isLoggable ( v4,p1 );
if ( p1 != null) { // if-eqz p1, :cond_5
final String p1 = "We failed to add our Fragment the first time around, trying again..."; // const-string p1, "We failed to add our Fragment the first time around, trying again..."
/* .line 149 */
android.util.Log .d ( v4,p1 );
} // :cond_5
/* .line 150 */
} // :cond_6
} // :goto_1
p1 = (( c.l.d.o1 ) p1 ).H ( ); // invoke-virtual {p1}, Lc/l/d/o1;->H()Z
if ( p1 != null) { // if-eqz p1, :cond_7
int p1 = 5; // const/4 p1, 0x5
/* .line 151 */
p1 = android.util.Log .isLoggable ( v4,p1 );
if ( p1 != null) { // if-eqz p1, :cond_8
final String p1 = "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled"; // const-string p1, "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled"
/* .line 152 */
android.util.Log .w ( v4,p1 );
} // :cond_7
int p1 = 6; // const/4 p1, 0x6
/* .line 153 */
p1 = android.util.Log .isLoggable ( v4,p1 );
if ( p1 != null) { // if-eqz p1, :cond_8
final String p1 = "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you\'re starting loads in a unit test with an Activity that you haven\'t created and never create.If you\'re using Robolectric, create the Activity as part of your test setup"; // const-string p1, "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you\'re starting loads in a unit test with an Activity that you haven\'t created and never create.If you\'re using Robolectric, create the Activity as part of your test setup"
/* .line 154 */
android.util.Log .e ( v4,p1 );
/* .line 155 */
} // :cond_8
} // :goto_2
(( e.b.a.z.l0 ) v0 ).A0 ( ); // invoke-virtual {v0}, Le/b/a/z/l0;->A0()Le/b/a/z/a;
(( e.b.a.z.a ) p1 ).a ( ); // invoke-virtual {p1}, Le/b/a/z/a;->a()V
} // .end method
public final e.b.a.u b ( android.content.Context p0 ) {
/* .locals 4 */
/* .line 1 */
v0 = this.a;
/* if-nez v0, :cond_1 */
/* .line 2 */
/* monitor-enter p0 */
/* .line 3 */
try { // :try_start_0
v0 = this.a;
/* if-nez v0, :cond_0 */
/* .line 4 */
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
e.b.a.d .a ( v0 );
/* .line 5 */
v1 = this.e;
/* new-instance v2, Le/b/a/z/b; */
/* invoke-direct {v2}, Le/b/a/z/b;-><init>()V */
/* new-instance v3, Le/b/a/z/i; */
/* invoke-direct {v3}, Le/b/a/z/i;-><init>()V */
/* .line 6 */
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
/* .line 7 */
this.a = p1;
/* .line 8 */
} // :cond_0
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
/* .line 9 */
} // :cond_1
} // :goto_0
p1 = this.a;
} // .end method
public e.b.a.z.t b ( android.app.Activity p0 ) {
/* .locals 1 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 16 */
(( android.app.Activity ) p1 ).getFragmentManager ( ); // invoke-virtual {p1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;
int v0 = 0; // const/4 v0, 0x0
(( e.b.a.z.v ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/b/a/z/v;->a(Landroid/app/FragmentManager;Landroid/app/Fragment;)Le/b/a/z/t;
} // .end method
public final void b ( android.app.FragmentManager p0, Object p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/app/FragmentManager;", */
/* "Lc/e/b<", */
/* "Landroid/view/View;", */
/* "Landroid/app/Fragment;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 10 */
} // :goto_0
v1 = this.h;
/* add-int/lit8 v2, v0, 0x1 */
final String v3 = "key"; // const-string v3, "key"
(( android.os.Bundle ) v1 ).putInt ( v3, v0 ); // invoke-virtual {v1, v3, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
int v0 = 0; // const/4 v0, 0x0
/* .line 11 */
try { // :try_start_0
v1 = this.h;
(( android.app.FragmentManager ) p1 ).getFragment ( v1, v3 ); // invoke-virtual {p1, v1, v3}, Landroid/app/FragmentManager;->getFragment(Landroid/os/Bundle;Ljava/lang/String;)Landroid/app/Fragment;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* nop */
} // :goto_1
/* if-nez v0, :cond_0 */
return;
/* .line 12 */
} // :cond_0
(( android.app.Fragment ) v0 ).getView ( ); // invoke-virtual {v0}, Landroid/app/Fragment;->getView()Landroid/view/View;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 13 */
(( android.app.Fragment ) v0 ).getView ( ); // invoke-virtual {v0}, Landroid/app/Fragment;->getView()Landroid/view/View;
(( c.e.i ) p2 ).put ( v1, v0 ); // invoke-virtual {p2, v1, v0}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 14 */
/* const/16 v3, 0x11 */
/* if-lt v1, v3, :cond_1 */
/* .line 15 */
(( android.app.Fragment ) v0 ).getChildFragmentManager ( ); // invoke-virtual {v0}, Landroid/app/Fragment;->getChildFragmentManager()Landroid/app/FragmentManager;
(( e.b.a.z.v ) p0 ).a ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Le/b/a/z/v;->a(Landroid/app/FragmentManager;Lc/e/b;)V
} // :cond_1
/* move v0, v2 */
} // .end method
public Boolean handleMessage ( android.os.Message p0 ) {
/* .locals 6 */
/* .line 1 */
/* iget v0, p1, Landroid/os/Message;->arg1:I */
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* if-ne v0, v2, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :goto_0
/* iget v3, p1, Landroid/os/Message;->what:I */
int v4 = 0; // const/4 v4, 0x0
/* if-eq v3, v2, :cond_2 */
int v5 = 2; // const/4 v5, 0x2
/* if-eq v3, v5, :cond_1 */
/* move-object p1, v4 */
int v2 = 0; // const/4 v2, 0x0
/* .line 3 */
} // :cond_1
p1 = this.obj;
/* check-cast p1, Lc/l/d/o1; */
/* .line 4 */
v0 = (( e.b.a.z.v ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/b/a/z/v;->a(Lc/l/d/o1;Z)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 5 */
v0 = this.c;
/* .line 6 */
} // :cond_2
p1 = this.obj;
/* check-cast p1, Landroid/app/FragmentManager; */
/* .line 7 */
v0 = (( e.b.a.z.v ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/b/a/z/v;->a(Landroid/app/FragmentManager;Z)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 8 */
v0 = this.b;
} // :goto_1
int v1 = 1; // const/4 v1, 0x1
} // :cond_3
/* move-object p1, v4 */
} // :goto_2
int v0 = 5; // const/4 v0, 0x5
final String v3 = "RMRetriever"; // const-string v3, "RMRetriever"
/* .line 9 */
v0 = android.util.Log .isLoggable ( v3,v0 );
if ( v0 != null) { // if-eqz v0, :cond_4
if ( v1 != null) { // if-eqz v1, :cond_4
/* if-nez v4, :cond_4 */
/* .line 10 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Failed to remove expected request manager fragment, manager: "; // const-string v1, "Failed to remove expected request manager fragment, manager: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v3,p1 );
} // :cond_4
} // .end method

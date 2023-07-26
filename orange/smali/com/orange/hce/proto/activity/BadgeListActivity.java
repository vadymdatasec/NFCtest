public class com.orange.hce.proto.activity.BadgeListActivity extends c.b.k.r implements e.h.b.a.l.y0$a implements e.h.b.a.p.c {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/orange/hce/proto/activity/BadgeListActivity$f; */
	 /* } */
} // .end annotation
/* # static fields */
public static final Integer O;
/* # instance fields */
public android.os.Handler A;
public android.widget.ImageButton B;
public androidx.recyclerview.widget.RecyclerView C;
public Boolean D;
public androidx.recyclerview.widget.LinearLayoutManager E;
public androidx.appcompat.widget.LinearLayoutCompat F;
public android.widget.TextView G;
public e.h.b.a.n.f H;
public com.google.android.material.snackbar.Snackbar I;
public com.google.android.material.snackbar.Snackbar J;
public android.content.BroadcastReceiver K;
public android.content.BroadcastReceiver L;
public e.h.b.a.n.d M;
public e.h.b.a.n.e N;
public e.h.b.a.l.y0 q;
public final android.content.BroadcastReceiver r;
public final android.content.BroadcastReceiver s;
public java.util.List t;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Landroid/app/AlertDialog;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public androidx.swiperefreshlayout.widget.SwipeRefreshLayout u;
public android.content.BroadcastReceiver v;
public android.content.BroadcastReceiver w;
public android.app.ProgressDialog x;
public android.view.View y;
public Boolean z;
/* # direct methods */
public static com.orange.hce.proto.activity.BadgeListActivity ( ) {
/* .locals 1 */
/* .line 1 */
return;
} // .end method
public com.orange.hce.proto.activity.BadgeListActivity ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Lc/b/k/r;-><init>()V */
/* .line 2 */
/* new-instance v0, Lcom/orange/hce/proto/activity/BadgeListActivity$a; */
/* invoke-direct {v0, p0}, Lcom/orange/hce/proto/activity/BadgeListActivity$a;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V */
this.r = v0;
/* .line 3 */
/* new-instance v0, Lcom/orange/hce/proto/activity/BadgeListActivity$b; */
/* invoke-direct {v0, p0}, Lcom/orange/hce/proto/activity/BadgeListActivity$b;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V */
this.s = v0;
/* .line 4 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.t = v0;
/* .line 5 */
/* new-instance v0, Lcom/orange/hce/proto/activity/BadgeListActivity$f; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Lcom/orange/hce/proto/activity/BadgeListActivity$f;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;Lcom/orange/hce/proto/activity/BadgeListActivity$a;)V */
this.v = v0;
/* .line 6 */
/* new-instance v0, Le/h/b/a/n/g; */
/* invoke-direct {v0, p0}, Le/h/b/a/n/g;-><init>(Landroid/app/Activity;)V */
this.w = v0;
/* .line 7 */
/* new-instance v0, Lcom/orange/hce/proto/activity/BadgeListActivity$c; */
/* invoke-direct {v0, p0}, Lcom/orange/hce/proto/activity/BadgeListActivity$c;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V */
this.K = v0;
/* .line 8 */
/* new-instance v0, Lcom/orange/hce/proto/activity/BadgeListActivity$d; */
/* invoke-direct {v0, p0}, Lcom/orange/hce/proto/activity/BadgeListActivity$d;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V */
this.L = v0;
return;
} // .end method
public static android.app.ProgressDialog a ( com.orange.hce.proto.activity.BadgeListActivity p0, android.app.ProgressDialog p1 ) { //synthethic
/* .locals 0 */
/* .line 4 */
this.x = p1;
} // .end method
public static e.h.b.a.l.y0 a ( com.orange.hce.proto.activity.BadgeListActivity p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.q;
} // .end method
public static void a ( com.orange.hce.proto.activity.BadgeListActivity p0, java.lang.String p1 ) { //synthethic
/* .locals 0 */
/* .line 3 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/BadgeListActivity;->b(Ljava/lang/String;)V
return;
} // .end method
public static Boolean a ( com.orange.hce.proto.activity.BadgeListActivity p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .line 2 */
/* iput-boolean p1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->D:Z */
} // .end method
public static java.lang.Class b ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/h/b/a/m/d;", */
/* ")", */
/* "Ljava/lang/Class<", */
/* "+", */
/* "Landroid/app/Activity;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 2 */
v0 = (( e.h.b.a.m.d ) p0 ).s ( ); // invoke-virtual {p0}, Le/h/b/a/m/d;->s()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
/* const-class p0, Lcom/orange/hce/proto/activity/CoffeeBadgeDetailActivity; */
/* .line 4 */
} // :cond_0
p0 = (( e.h.b.a.m.d ) p0 ).t ( ); // invoke-virtual {p0}, Le/h/b/a/m/d;->t()Z
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 5 */
/* const-class p0, Lcom/orange/hce/proto/activity/DefaultBadgeDetailActivity; */
/* .line 6 */
} // :cond_1
/* const-class p0, Lcom/orange/hce/proto/activity/AccessBadgeDetailActivity; */
} // .end method
public static Boolean b ( com.orange.hce.proto.activity.BadgeListActivity p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* iget-boolean p0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->D:Z */
} // .end method
public static void c ( com.orange.hce.proto.activity.BadgeListActivity p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).N ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->N()V
return;
} // .end method
public static androidx.swiperefreshlayout.widget.SwipeRefreshLayout d ( com.orange.hce.proto.activity.BadgeListActivity p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.u;
} // .end method
public static android.app.ProgressDialog e ( com.orange.hce.proto.activity.BadgeListActivity p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.x;
} // .end method
public static Boolean f ( com.orange.hce.proto.activity.BadgeListActivity p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* iget-boolean p0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->z:Z */
} // .end method
public static void g ( com.orange.hce.proto.activity.BadgeListActivity p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).s ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->s()V
return;
} // .end method
/* # virtual methods */
public void A ( ) { //synthethic
/* .locals 1 */
/* .line 1 */
v0 = this.q;
(( e.h.b.a.l.y0 ) v0 ).e ( ); // invoke-virtual {v0}, Le/h/b/a/l/y0;->e()V
return;
} // .end method
public void B ( ) { //synthethic
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->b(Z)V
/* .line 2 */
v0 = this.A;
/* new-instance v1, Le/h/b/a/l/m; */
/* invoke-direct {v1, p0}, Le/h/b/a/l/m;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V */
/* const-wide/16 v2, 0xbb8 */
(( android.os.Handler ) v0 ).postDelayed ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
return;
} // .end method
public void C ( ) { //synthethic
/* .locals 3 */
final String v0 = "packid.BadgeList"; // const-string v0, "packid.BadgeList"
final String v1 = "scheduleShowcaseDisplay"; // const-string v1, "scheduleShowcaseDisplay"
/* .line 1 */
android.util.Log .d ( v0,v1 );
/* .line 2 */
v0 = this.q;
v1 = this.B;
v2 = this.C;
e.h.b.a.k .a ( v0,v1,v2 );
return;
} // .end method
public void D ( ) { //synthethic
/* .locals 2 */
/* .line 1 */
v0 = v0 = this.t;
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = this.t;
int v1 = 0; // const/4 v1, 0x0
/* check-cast v0, Landroid/app/AlertDialog; */
(( android.app.AlertDialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
} // :cond_0
return;
} // .end method
public void E ( ) { //synthethic
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->b(Z)V
return;
} // .end method
public final void F ( ) {
/* .locals 2 */
/* .line 1 */
v0 = v0 = this.t;
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = this.t;
int v1 = 0; // const/4 v1, 0x0
} // :cond_0
return;
} // .end method
public final void G ( ) {
/* .locals 4 */
/* .line 1 */
(( android.app.Activity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
int v1 = 0; // const/4 v1, 0x0
final String v2 = "packid.app.preferences"; // const-string v2, "packid.app.preferences"
(( android.content.Context ) v0 ).getSharedPreferences ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
final String v2 = "ADD_SHOW_CASE"; // const-string v2, "ADD_SHOW_CASE"
int v3 = 1; // const/4 v3, 0x1
v3 = /* .line 2 */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 3 */
/* .line 4 */
v0 = this.C;
/* new-instance v1, Le/h/b/a/l/d; */
/* invoke-direct {v1, p0}, Le/h/b/a/l/d;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V */
/* const-wide/16 v2, 0x1388 */
(( android.view.ViewGroup ) v0 ).postDelayed ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/view/ViewGroup;->postDelayed(Ljava/lang/Runnable;J)Z
} // :cond_0
return;
} // .end method
public final void H ( ) {
/* .locals 4 */
/* const v0, 0x7f08016b */
/* .line 1 */
(( c.b.k.r ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroidx/appcompat/widget/Toolbar; */
/* .line 2 */
(( c.b.k.r ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/r;->a(Landroidx/appcompat/widget/Toolbar;)V
/* .line 3 */
(( c.b.k.r ) p0 ).p ( ); // invoke-virtual {p0}, Lc/b/k/r;->p()Lc/b/k/a;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
(( c.b.k.r ) p0 ).p ( ); // invoke-virtual {p0}, Lc/b/k/r;->p()Lc/b/k/a;
(( c.b.k.r ) p0 ).getResources ( ); // invoke-virtual {p0}, Lc/b/k/r;->getResources()Landroid/content/res/Resources;
/* const v3, 0x7f0e00cf */
(( android.content.res.Resources ) v2 ).getString ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
(( c.b.k.a ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lc/b/k/a;->a(Ljava/lang/CharSequence;)V
/* .line 5 */
} // :cond_0
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "onCreate with url "; // const-string v2, "onCreate with url "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.app.Activity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) v2 ).getData ( ); // invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v2 = "packid.BadgeList"; // const-string v2, "packid.BadgeList"
android.util.Log .d ( v2,v1 );
/* const v1, 0x7f050026 */
/* .line 6 */
v2 = c.h.f.f .a ( p0,v1 );
(( android.view.ViewGroup ) v0 ).setBackgroundColor ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setBackgroundColor(I)V
/* .line 7 */
/* const/16 v2, 0x15 */
/* if-lt v0, v2, :cond_1 */
/* .line 8 */
(( android.app.Activity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
v1 = c.h.f.f .a ( p0,v1 );
(( android.view.Window ) v0 ).setStatusBarColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V
} // :cond_1
return;
} // .end method
public final void I ( ) {
/* .locals 3 */
/* const v0, 0x7f080061 */
/* .line 1 */
(( c.b.k.r ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroidx/recyclerview/widget/RecyclerView; */
this.C = v0;
/* .line 2 */
/* new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager; */
/* invoke-direct {v0, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V */
this.E = v0;
int v1 = 3; // const/4 v1, 0x3
/* .line 3 */
(( androidx.recyclerview.widget.LinearLayoutManager ) v0 ).j ( v1 ); // invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->j(I)V
/* .line 4 */
v0 = this.E;
int v2 = 1; // const/4 v2, 0x1
(( androidx.recyclerview.widget.RecyclerView$o ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Z)V
/* .line 5 */
v0 = this.C;
(( androidx.recyclerview.widget.RecyclerView ) v0 ).setItemViewCacheSize ( v1 ); // invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemViewCacheSize(I)V
/* .line 6 */
v0 = this.C;
v1 = this.E;
(( androidx.recyclerview.widget.RecyclerView ) v0 ).setLayoutManager ( v1 ); // invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V
/* .line 7 */
v0 = this.C;
/* new-instance v1, Lcom/orange/hce/proto/activity/BadgeListActivity$e; */
/* invoke-direct {v1, p0}, Lcom/orange/hce/proto/activity/BadgeListActivity$e;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V */
(( androidx.recyclerview.widget.RecyclerView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->a(Landroidx/recyclerview/widget/RecyclerView$t;)V
/* const v0, 0x7f080158 */
/* .line 8 */
(( c.b.k.r ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* const/16 v1, 0x8 */
/* .line 9 */
(( android.view.View ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
/* .line 10 */
/* new-instance v0, Le/h/b/a/l/y0; */
/* invoke-direct {v0, p0}, Le/h/b/a/l/y0;-><init>(Landroid/content/Context;)V */
this.q = v0;
/* .line 11 */
v1 = this.C;
(( androidx.recyclerview.widget.RecyclerView ) v1 ).setAdapter ( v0 ); // invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V
/* const v0, 0x7f080146 */
/* .line 12 */
(( c.b.k.r ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout; */
this.u = v0;
/* .line 13 */
/* new-instance v1, Le/h/b/a/l/f; */
/* invoke-direct {v1, p0}, Le/h/b/a/l/f;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) v0 ).setOnRefreshListener ( v1 ); // invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;)V
return;
} // .end method
public final void J ( ) {
/* .locals 3 */
/* .line 1 */
(( android.app.Activity ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
final String v1 = "com.orange.oab.packid.ble"; // const-string v1, "com.orange.oab.packid.ble"
/* .line 2 */
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* const v1, 0x7f080192 */
/* .line 3 */
(( c.b.k.r ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroidx/appcompat/widget/LinearLayoutCompat; */
this.F = v1;
/* const v1, 0x7f080191 */
/* .line 4 */
(( c.b.k.r ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/TextView; */
this.G = v1;
/* .line 5 */
v1 = this.F;
/* new-instance v2, Le/h/b/a/l/i; */
/* invoke-direct {v2, p0, v0}, Le/h/b/a/l/i;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;Ljava/lang/String;)V */
(( android.view.ViewGroup ) v1 ).setOnClickListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V
} // :cond_0
return;
} // .end method
public void K ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.E;
int v1 = 0; // const/4 v1, 0x0
(( androidx.recyclerview.widget.LinearLayoutManager ) v0 ).i ( v1 ); // invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->i(I)V
/* .line 2 */
v0 = this.C;
/* new-instance v1, Le/h/b/a/l/h; */
/* invoke-direct {v1, p0}, Le/h/b/a/l/h;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V */
/* const-wide/16 v2, 0x1f4 */
(( android.view.ViewGroup ) v0 ).postDelayed ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/view/ViewGroup;->postDelayed(Ljava/lang/Runnable;J)Z
return;
} // .end method
public final void L ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Le/h/b/a/l/e; */
/* invoke-direct {v0, p0}, Le/h/b/a/l/e;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V */
(( android.app.Activity ) p0 ).runOnUiThread ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
return;
} // .end method
public final void M ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Landroid/content/Intent; */
/* const-class v1, Lcom/orange/hce/proto/activity/PermissionsActivity; */
/* invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 2 */
(( android.app.Activity ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
/* .line 3 */
(( android.app.Activity ) p0 ).finish ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finish()V
return;
} // .end method
public final void N ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.q;
int v1 = 0; // const/4 v1, 0x0
v0 = (( e.h.b.a.l.y0 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/h/b/a/l/y0;->b(Z)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.A;
int v1 = 0; // const/4 v1, 0x0
(( android.os.Handler ) v0 ).removeCallbacksAndMessages ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V
/* .line 3 */
v0 = this.A;
/* new-instance v1, Le/h/b/a/l/k; */
/* invoke-direct {v1, p0}, Le/h/b/a/l/k;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V */
/* const-wide/16 v2, 0x2710 */
(( android.os.Handler ) v0 ).postDelayed ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
} // :cond_0
return;
} // .end method
public void O ( ) {
/* .locals 5 */
/* .line 1 */
(( android.app.Activity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
v0 = com.orange.business.packid.android.lib.PackIdUtility .getBluetoothState ( v0 );
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* const/16 v3, 0xc */
/* if-ne v3, v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :goto_0
/* const/16 v4, 0x17 */
/* if-lt v3, v4, :cond_1 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
} // :goto_1
/* if-lt v3, v4, :cond_2 */
final String v2 = "power"; // const-string v2, "power"
/* .line 4 */
(( android.app.Activity ) p0 ).getSystemService ( v2 ); // invoke-virtual {p0, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v2, Landroid/os/PowerManager; */
/* .line 5 */
(( android.app.Activity ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
v2 = (( android.os.PowerManager ) v2 ).isIgnoringBatteryOptimizations ( v3 ); // invoke-virtual {v2, v3}, Landroid/os/PowerManager;->isIgnoringBatteryOptimizations(Ljava/lang/String;)Z
/* .line 6 */
} // :cond_2
v3 = this.q;
(( e.h.b.a.l.y0 ) v3 ).a ( v0, v1, v2 ); // invoke-virtual {v3, v0, v1, v2}, Le/h/b/a/l/y0;->a(ZZZ)V
/* if-nez v0, :cond_3 */
/* .line 7 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).u ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->u()Lcom/google/android/material/snackbar/Snackbar;
(( com.google.android.material.snackbar.Snackbar ) v0 ).l ( ); // invoke-virtual {v0}, Lcom/google/android/material/snackbar/Snackbar;->l()V
/* .line 8 */
} // :cond_3
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).u ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->u()Lcom/google/android/material/snackbar/Snackbar;
(( com.google.android.material.snackbar.Snackbar ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/google/android/material/snackbar/Snackbar;->b()V
} // :goto_2
return;
} // .end method
public void a ( ) {
/* .locals 2 */
/* .line 39 */
v0 = this.F;
v0 = (( android.view.ViewGroup ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I
/* const/16 v1, 0x8 */
/* if-eq v0, v1, :cond_0 */
/* .line 40 */
v0 = this.F;
(( android.view.ViewGroup ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V
} // :cond_0
return;
} // .end method
public final void a ( android.app.AlertDialog p0 ) {
/* .locals 0 */
/* .line 17 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/BadgeListActivity;->b(Landroid/app/AlertDialog;)V
/* .line 18 */
p1 = (( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).y ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->y()Z
/* if-nez p1, :cond_0 */
/* .line 19 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).L ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->L()V
} // :cond_0
return;
} // .end method
public void a ( android.content.DialogInterface p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* .line 16 */
(( android.app.Activity ) p0 ).finishAffinity ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V
return;
} // .end method
public void a ( android.net.Uri p0 ) { //synthethic
/* .locals 1 */
/* .line 27 */
/* new-instance v0, Lcom/orange/business/packid/android/lib/PackId; */
/* invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
(( com.orange.business.packid.android.lib.PackId ) v0 ).register ( p1 ); // invoke-virtual {v0, p1}, Lcom/orange/business/packid/android/lib/PackId;->register(Landroid/net/Uri;)V
return;
} // .end method
public void a ( android.view.Menu p0 ) {
/* .locals 2 */
/* const v0, 0x7f080107 */
/* .line 20 */
/* .line 21 */
/* new-instance v0, Landroid/widget/ImageButton; */
/* invoke-direct {v0, p0}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;)V */
this.B = v0;
int v1 = 0; // const/4 v1, 0x0
/* .line 22 */
(( android.widget.ImageButton ) v0 ).setBackground ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackground(Landroid/graphics/drawable/Drawable;)V
/* .line 23 */
v0 = this.B;
/* const v1, 0x7f0700ba */
(( android.widget.ImageButton ) v0 ).setImageResource ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V
/* .line 24 */
v0 = this.B;
/* new-instance v1, Le/h/b/a/l/l; */
/* invoke-direct {v1, p0}, Le/h/b/a/l/l;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V */
(( android.widget.ImageButton ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 25 */
v0 = this.B;
return;
} // .end method
public void a ( android.view.View p0 ) { //synthethic
/* .locals 1 */
/* .line 26 */
/* new-instance p1, Landroid/content/Intent; */
/* const-class v0, Lcom/orange/hce/proto/activity/QrCodeActivity; */
/* invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
int v0 = 2; // const/4 v0, 0x2
(( androidx.activity.ComponentActivity ) p0 ).startActivityForResult ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 3 */
/* .line 28 */
/* new-instance v0, Landroid/content/Intent; */
com.orange.hce.proto.activity.BadgeListActivity .b ( p1 );
/* invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 29 */
/* new-instance v1, Landroid/os/Bundle; */
/* invoke-direct {v1}, Landroid/os/Bundle;-><init>()V */
final String v2 = "BADGE"; // const-string v2, "BADGE"
/* .line 30 */
(( android.os.Bundle ) v1 ).putSerializable ( v2, p1 ); // invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V
/* .line 31 */
(( android.content.Intent ) v0 ).putExtras ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
/* .line 32 */
(( android.app.Activity ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
return;
} // .end method
public void a ( Object p0, java.lang.Boolean p1 ) {
/* .locals 2 */
/* .line 33 */
(( android.app.Activity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
(( e.h.b.a.m.d ) p1 ).d ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;
(( e.h.b.a.m.d ) p1 ).a ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;
p2 = (( java.lang.Boolean ) p2 ).booleanValue ( ); // invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z
com.orange.oab.contactless.packid.service.ZoneDetectionNotification .saveAutorisedValue ( v0,v1,p1,p2 );
return;
} // .end method
public void a ( java.lang.String p0 ) {
/* .locals 4 */
/* .line 34 */
v0 = this.F;
v0 = (( android.view.ViewGroup ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 35 */
v0 = this.F;
(( android.view.ViewGroup ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V
/* .line 36 */
} // :cond_0
(( c.b.k.r ) p0 ).getResources ( ); // invoke-virtual {p0}, Lc/b/k/r;->getResources()Landroid/content/res/Resources;
/* const v2, 0x7f0e00d4 */
(( android.content.res.Resources ) v0 ).getString ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 37 */
(( c.b.k.r ) p0 ).getResources ( ); // invoke-virtual {p0}, Lc/b/k/r;->getResources()Landroid/content/res/Resources;
/* const v2, 0x7f0e00d3 */
int v3 = 1; // const/4 v3, 0x1
/* new-array v3, v3, [Ljava/lang/Object; */
/* aput-object p1, v3, v1 */
(( android.content.res.Resources ) v0 ).getString ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
/* .line 38 */
} // :cond_1
p1 = this.G;
(( android.widget.TextView ) p1 ).setText ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
return;
} // .end method
public void a ( java.lang.String p0, android.view.View p1 ) { //synthethic
/* .locals 3 */
final String p2 = "android.intent.action.VIEW"; // const-string p2, "android.intent.action.VIEW"
/* .line 5 */
try { // :try_start_0
/* new-instance v0, Landroid/content/Intent; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "market://details?id="; // const-string v2, "market://details?id="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.net.Uri .parse ( v1 );
/* invoke-direct {v0, p2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
(( android.app.Activity ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Landroid/content/ActivityNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 6 */
/* :catch_0 */
/* new-instance v0, Landroid/content/Intent; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "https://play.google.com/store/apps/details?id="; // const-string v2, "https://play.google.com/store/apps/details?id="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.net.Uri .parse ( p1 );
/* invoke-direct {v0, p2, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
(( android.app.Activity ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
} // :goto_0
return;
} // .end method
public final void a ( java.util.List p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lcom/orange/oab/contactless/packid/hce/user/User;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 11 */
v0 = } // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast v0, Lcom/orange/oab/contactless/packid/hce/user/User; */
/* .line 12 */
(( com.orange.oab.contactless.packid.hce.user.User ) v0 ).getWallet ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
(( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v0 ).getBadges ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
/* .line 13 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getZoneId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v1 ).toHexa ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
/* .line 14 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Subscribe to topic "; // const-string v3, "Subscribe to topic "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v3 = "packid.BadgeList"; // const-string v3, "packid.BadgeList"
android.util.Log .i ( v3,v2 );
/* .line 15 */
com.google.firebase.messaging.FirebaseMessaging .c ( );
(( com.google.firebase.messaging.FirebaseMessaging ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Lcom/google/firebase/messaging/FirebaseMessaging;->a(Ljava/lang/String;)Le/f/a/b/h/g;
} // :cond_1
return;
} // .end method
public final void a ( Boolean p0 ) {
/* .locals 0 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 7 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).t ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->t()V
/* .line 8 */
} // :cond_0
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).v ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->v()Lcom/google/android/material/snackbar/Snackbar;
(( com.google.android.material.snackbar.Snackbar ) p1 ).l ( ); // invoke-virtual {p1}, Lcom/google/android/material/snackbar/Snackbar;->l()V
} // :goto_0
return;
} // .end method
public final void a ( Boolean p0, Boolean p1 ) {
/* .locals 0 */
/* if-nez p1, :cond_1 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 9 */
} // :cond_0
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).v ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->v()Lcom/google/android/material/snackbar/Snackbar;
(( com.google.android.material.snackbar.Snackbar ) p1 ).l ( ); // invoke-virtual {p1}, Lcom/google/android/material/snackbar/Snackbar;->l()V
/* .line 10 */
} // :cond_1
} // :goto_0
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).t ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->t()V
} // :goto_1
return;
} // .end method
public final void b ( android.app.AlertDialog p0 ) {
/* .locals 1 */
/* .line 22 */
v0 = this.t;
return;
} // .end method
public void b ( android.content.DialogInterface p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* .line 20 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).F ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->F()V
/* .line 21 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).L ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->L()V
return;
} // .end method
public void b ( android.view.View p0 ) { //synthethic
/* .locals 0 */
/* .line 7 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).M ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->M()V
return;
} // .end method
public final void b ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 17 */
/* new-instance v0, Le/h/b/a/l/p; */
/* invoke-direct {v0, p0}, Le/h/b/a/l/p;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V */
/* .line 18 */
/* new-instance v1, Landroid/app/AlertDialog$Builder; */
/* invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
(( android.app.AlertDialog$Builder ) v1 ).setMessage ( p1 ); // invoke-virtual {v1, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* const v1, 0x7f0e0064 */
(( android.app.AlertDialog$Builder ) p1 ).setNeutralButton ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
(( android.app.AlertDialog$Builder ) p1 ).create ( ); // invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
/* .line 19 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/BadgeListActivity;->a(Landroid/app/AlertDialog;)V
return;
} // .end method
public final void b ( Boolean p0 ) {
/* .locals 4 */
/* .line 10 */
/* new-instance v0, Lcom/orange/business/packid/android/lib/PackId; */
/* invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
(( com.orange.business.packid.android.lib.PackId ) v0 ).getUsers ( ); // invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->getUsers()Ljava/util/List;
/* .line 11 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->a(Ljava/util/List;)V
v1 = /* .line 12 */
final String v2 = "packid.BadgeList"; // const-string v2, "packid.BadgeList"
int v3 = 0; // const/4 v3, 0x0
/* if-nez v1, :cond_0 */
/* check-cast v0, Lcom/orange/oab/contactless/packid/hce/user/User; */
v0 = (( com.orange.oab.contactless.packid.hce.user.User ) v0 ).isDefault ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->isDefault()Z
if ( v0 != null) { // if-eqz v0, :cond_0
if ( p1 != null) { // if-eqz p1, :cond_0
final String p1 = "refreshUsers recreate default user"; // const-string p1, "refreshUsers recreate default user"
/* .line 13 */
android.util.Log .d ( v2,p1 );
/* .line 14 */
/* new-instance p1, Lcom/orange/business/packid/android/lib/PackId; */
/* invoke-direct {p1, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
(( com.orange.business.packid.android.lib.PackId ) p1 ).createDefaultUser ( ); // invoke-virtual {p1}, Lcom/orange/business/packid/android/lib/PackId;->createDefaultUser()Lcom/orange/oab/contactless/packid/hce/user/User;
} // :cond_0
final String p1 = "refreshUsers update users"; // const-string p1, "refreshUsers update users"
/* .line 15 */
android.util.Log .d ( v2,p1 );
/* .line 16 */
/* new-instance p1, Lcom/orange/business/packid/android/lib/PackId; */
/* invoke-direct {p1, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
(( android.app.Activity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
final String v1 = "PackIdLibFirebaseMessagingService"; // const-string v1, "PackIdLibFirebaseMessagingService"
(( android.content.Context ) v0 ).getSharedPreferences ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
final String v1 = "token"; // const-string v1, "token"
final String v2 = ""; // const-string v2, ""
(( com.orange.business.packid.android.lib.PackId ) p1 ).update ( v3, v0 ); // invoke-virtual {p1, v3, v0}, Lcom/orange/business/packid/android/lib/PackId;->update(ZLjava/lang/String;)V
} // :goto_0
return;
} // .end method
public final void b ( Boolean p0, Boolean p1 ) {
/* .locals 0 */
if ( p1 != null) { // if-eqz p1, :cond_0
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 8 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).t ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->t()V
/* .line 9 */
} // :cond_0
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).v ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->v()Lcom/google/android/material/snackbar/Snackbar;
(( com.google.android.material.snackbar.Snackbar ) p1 ).l ( ); // invoke-virtual {p1}, Lcom/google/android/material/snackbar/Snackbar;->l()V
} // :goto_0
return;
} // .end method
public void c ( android.view.View p0 ) { //synthethic
/* .locals 0 */
/* .line 3 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).M ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->M()V
return;
} // .end method
public void c ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 4 */
/* new-instance v0, Le/h/b/a/l/j; */
/* invoke-direct {v0, p0}, Le/h/b/a/l/j;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V */
/* .line 5 */
/* new-instance v1, Landroid/app/AlertDialog$Builder; */
/* invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
(( android.app.AlertDialog$Builder ) v1 ).setMessage ( p1 ); // invoke-virtual {v1, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* const v1, 0x7f0e0064 */
(( android.app.AlertDialog$Builder ) p1 ).setNeutralButton ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
(( android.app.AlertDialog$Builder ) p1 ).create ( ); // invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
/* .line 6 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/BadgeListActivity;->a(Landroid/app/AlertDialog;)V
return;
} // .end method
public void c ( Boolean p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.q;
(( e.h.b.a.l.y0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/h/b/a/l/y0;->a(Z)V
return;
} // .end method
public void onActivityResult ( Integer p0, Integer p1, android.content.Intent p2 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1, p2, p3}, Lc/l/d/f0;->onActivityResult(IILandroid/content/Intent;)V */
int v0 = 2; // const/4 v0, 0x2
/* if-ne p1, v0, :cond_0 */
int p1 = -1; // const/4 p1, -0x1
/* if-ne p2, p1, :cond_0 */
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 2 */
(( android.content.Intent ) p3 ).getData ( ); // invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
(( android.app.Activity ) p0 ).setIntent ( p3 ); // invoke-virtual {p0, p3}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V
} // :cond_0
return;
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 3 */
final String v0 = "packid.BadgeList"; // const-string v0, "packid.BadgeList"
final String v1 = "onCreate"; // const-string v1, "onCreate"
/* .line 1 */
android.util.Log .v ( v0,v1 );
/* .line 2 */
/* invoke-super {p0, p1}, Lc/b/k/r;->onCreate(Landroid/os/Bundle;)V */
/* const p1, 0x7f0b001d */
/* .line 3 */
(( c.b.k.r ) p0 ).setContentView ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->setContentView(I)V
/* const p1, 0x7f080040 */
/* .line 4 */
(( c.b.k.r ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
this.y = p1;
/* .line 5 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).H ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->H()V
/* .line 6 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).J ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->J()V
/* .line 7 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).I ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->I()V
/* .line 8 */
p1 = this.r;
/* new-instance v1, Landroid/content/IntentFilter; */
final String v2 = "android.bluetooth.adapter.action.STATE_CHANGED"; // const-string v2, "android.bluetooth.adapter.action.STATE_CHANGED"
/* invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( android.app.Activity ) p0 ).registerReceiver ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
/* .line 9 */
p1 = this.s;
/* new-instance v1, Landroid/content/IntentFilter; */
final String v2 = "android.nfc.action.ADAPTER_STATE_CHANGED"; // const-string v2, "android.nfc.action.ADAPTER_STATE_CHANGED"
/* invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( android.app.Activity ) p0 ).registerReceiver ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
/* .line 10 */
/* new-instance p1, Le/h/b/a/n/f; */
v1 = this.q;
/* invoke-direct {p1, v1}, Le/h/b/a/n/f;-><init>(Le/h/b/a/l/y0;)V */
this.H = p1;
/* .line 11 */
/* new-instance p1, Le/h/b/a/n/d; */
v1 = this.q;
/* invoke-direct {p1, v1}, Le/h/b/a/n/d;-><init>(Le/h/b/a/l/y0;)V */
this.M = p1;
/* .line 12 */
/* new-instance p1, Le/h/b/a/n/e; */
v1 = this.q;
/* invoke-direct {p1, v1}, Le/h/b/a/n/e;-><init>(Le/h/b/a/l/y0;)V */
this.N = p1;
/* .line 13 */
p1 = this.u;
int v1 = 0; // const/4 v1, 0x0
(( android.view.ViewGroup ) p1 ).setVisibility ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V
/* .line 14 */
/* new-instance p1, Landroid/os/Handler; */
android.os.Looper .getMainLooper ( );
/* invoke-direct {p1, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
this.A = p1;
final String p1 = "onCreate done"; // const-string p1, "onCreate done"
/* .line 15 */
android.util.Log .v ( v0,p1 );
return;
} // .end method
public Boolean onCreateOptionsMenu ( android.view.Menu p0 ) {
/* .locals 2 */
/* .line 1 */
(( c.b.k.r ) p0 ).getMenuInflater ( ); // invoke-virtual {p0}, Lc/b/k/r;->getMenuInflater()Landroid/view/MenuInflater;
/* const/high16 v1, 0x7f0c0000 */
(( android.view.MenuInflater ) v0 ).inflate ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V
/* .line 2 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/BadgeListActivity;->a(Landroid/view/Menu;)V
int p1 = 1; // const/4 p1, 0x1
} // .end method
public void onDestroy ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.r;
(( android.app.Activity ) p0 ).unregisterReceiver ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
/* .line 2 */
v0 = this.s;
(( android.app.Activity ) p0 ).unregisterReceiver ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
/* .line 3 */
c.p.a.d .a ( p0 );
v1 = this.w;
(( c.p.a.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V
/* .line 4 */
/* invoke-super {p0}, Lc/b/k/r;->onDestroy()V */
return;
} // .end method
public Boolean onOptionsItemSelected ( android.view.MenuItem p0 ) {
/* .locals 3 */
v0 = /* .line 1 */
/* const v1, 0x7f0800a9 */
int v2 = 1; // const/4 v2, 0x1
/* if-eq v0, v1, :cond_2 */
/* const v1, 0x7f0800cb */
/* if-eq v0, v1, :cond_1 */
/* const v1, 0x7f080107 */
/* if-eq v0, v1, :cond_0 */
/* .line 2 */
p1 = /* invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z */
/* .line 3 */
} // :cond_0
/* new-instance p1, Landroid/content/Intent; */
/* const-class v0, Lcom/orange/hce/proto/activity/QrCodeActivity; */
/* invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
int v0 = 2; // const/4 v0, 0x2
(( androidx.activity.ComponentActivity ) p0 ).startActivityForResult ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V
/* .line 4 */
} // :cond_1
/* new-instance p1, Landroid/content/Intent; */
/* const-class v0, Lcom/orange/hce/proto/activity/LegalInformationActivity; */
/* invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
(( android.app.Activity ) p0 ).startActivity ( p1 ); // invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
/* .line 5 */
} // :cond_2
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).K ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->K()V
} // .end method
public void onPause ( ) {
/* .locals 2 */
final String v0 = "packid.BadgeList"; // const-string v0, "packid.BadgeList"
final String v1 = "onPause"; // const-string v1, "onPause"
/* .line 1 */
android.util.Log .d ( v0,v1 );
/* .line 2 */
c.p.a.d .a ( p0 );
v1 = this.v;
(( c.p.a.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V
/* .line 3 */
c.p.a.d .a ( p0 );
v1 = this.K;
(( c.p.a.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V
/* .line 4 */
c.p.a.d .a ( p0 );
v1 = this.L;
(( c.p.a.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V
/* .line 5 */
c.p.a.d .a ( p0 );
v1 = this.H;
(( c.p.a.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V
/* .line 6 */
c.p.a.d .a ( p0 );
v1 = this.N;
(( c.p.a.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V
/* .line 7 */
c.p.a.d .a ( p0 );
v1 = this.M;
(( c.p.a.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V
/* .line 8 */
/* new-instance v0, Lcom/orange/business/packid/android/lib/PackId; */
/* invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
(( com.orange.business.packid.android.lib.PackId ) v0 ).stopBroadcastRSSILevel ( ); // invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->stopBroadcastRSSILevel()V
/* .line 9 */
v0 = this.A;
int v1 = 0; // const/4 v1, 0x0
(( android.os.Handler ) v0 ).removeCallbacksAndMessages ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V
/* .line 10 */
/* invoke-super {p0}, Lc/l/d/f0;->onPause()V */
return;
} // .end method
public Boolean onPrepareOptionsMenu ( android.view.Menu p0 ) {
/* .locals 2 */
/* const v0, 0x7f080193 */
/* .line 1 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).w ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->w()Ljava/lang/String;
/* .line 2 */
p1 = /* invoke-super {p0, p1}, Landroid/app/Activity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z */
} // .end method
public void onRequestPermissionsResult ( Integer p0, java.lang.String[] p1, Integer[] p2 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, v0, :cond_0 */
/* .line 1 */
/* array-length p1, p2 */
/* if-lez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* aget-object p2, p2, p1 */
final String v0 = "android.permission.ACCESS_FINE_LOCATION"; // const-string v0, "android.permission.ACCESS_FINE_LOCATION"
/* .line 2 */
p2 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p2 != null) { // if-eqz p2, :cond_0
/* array-length p2, p3 */
/* if-lez p2, :cond_0 */
/* aget p1, p3, p1 */
int p2 = -1; // const/4 p2, -0x1
/* if-ne p1, p2, :cond_0 */
/* .line 3 */
p1 = c.h.e.f .a ( p0,v0 );
/* if-nez p1, :cond_0 */
final String p1 = "packid.BadgeList"; // const-string p1, "packid.BadgeList"
final String p2 = "User checked \'do not ask again\' when asked for permission"; // const-string p2, "User checked \'do not ask again\' when asked for permission"
/* .line 4 */
android.util.Log .w ( p1,p2 );
} // :cond_0
return;
} // .end method
public void onResume ( ) {
/* .locals 4 */
/* .line 1 */
/* invoke-super {p0}, Lc/l/d/f0;->onResume()V */
/* .line 2 */
/* new-instance v0, Le/h/b/a/p/d; */
/* invoke-direct {v0, p0, p0}, Le/h/b/a/p/d;-><init>(Landroid/content/Context;Le/h/b/a/p/c;)V */
/* .line 3 */
(( e.h.b.a.p.d ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/b/a/p/d;->a()V
/* .line 4 */
c.p.a.d .a ( p0 );
v1 = this.v;
v2 = e.h.b.a.p.l.a;
(( c.p.a.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
/* .line 5 */
c.p.a.d .a ( p0 );
v1 = this.w;
v2 = e.h.b.a.p.l.b;
(( c.p.a.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
/* .line 6 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).x ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->x()V
/* .line 7 */
(( android.app.Activity ) p0 ).getApplication ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;
/* check-cast v0, Lcom/orange/hce/proto/PackIdApp; */
(( com.orange.hce.proto.PackIdApp ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/orange/hce/proto/PackIdApp;->a()Lcom/orange/business/packid/android/lib/PackId;
/* .line 8 */
(( com.orange.business.packid.android.lib.PackId ) v0 ).start ( ); // invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->start()V
/* .line 9 */
v1 = (( com.orange.business.packid.android.lib.PackId ) v0 ).hasBleBadges ( ); // invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->hasBleBadges()Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v1 = 1; // const/4 v1, 0x1
/* .line 10 */
/* iput-boolean v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->z:Z */
/* .line 11 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).s ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->s()V
/* .line 12 */
} // :cond_0
(( com.orange.business.packid.android.lib.PackId ) v0 ).startBroadcastRSSILevel ( ); // invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->startBroadcastRSSILevel()V
/* .line 13 */
c.p.a.d .a ( p0 );
v1 = this.K;
/* new-instance v2, Landroid/content/IntentFilter; */
final String v3 = "com.orange.oab.contactless.packid.intent.Intent.ACTION_RSSI_LEVEL_CHANGED"; // const-string v3, "com.orange.oab.contactless.packid.intent.Intent.ACTION_RSSI_LEVEL_CHANGED"
/* invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( c.p.a.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
/* .line 14 */
c.p.a.d .a ( p0 );
v1 = this.L;
/* new-instance v2, Landroid/content/IntentFilter; */
final String v3 = "com.orange.oab.contactless.packid.intent.Intent.ACTION_RSSI_BUTTON_IN_RANGE"; // const-string v3, "com.orange.oab.contactless.packid.intent.Intent.ACTION_RSSI_BUTTON_IN_RANGE"
/* invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( c.p.a.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
/* .line 15 */
c.p.a.d .a ( p0 );
v1 = this.H;
/* new-instance v2, Landroid/content/IntentFilter; */
final String v3 = "com.orange.oab.contactless.packid.action.CONTACTLESS_TRANSACTION"; // const-string v3, "com.orange.oab.contactless.packid.action.CONTACTLESS_TRANSACTION"
/* invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( c.p.a.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
/* .line 16 */
c.p.a.d .a ( p0 );
v1 = this.M;
/* new-instance v2, Landroid/content/IntentFilter; */
final String v3 = "com.orange.oab.contactless.packid.intent.Intent.ACTION_BADGE_LOCKED"; // const-string v3, "com.orange.oab.contactless.packid.intent.Intent.ACTION_BADGE_LOCKED"
/* invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( c.p.a.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
/* .line 17 */
c.p.a.d .a ( p0 );
v1 = this.N;
/* new-instance v2, Landroid/content/IntentFilter; */
final String v3 = "com.orange.oab.contactless.packid.intent.Intent.ACTION_BADGE_UNLOCKED"; // const-string v3, "com.orange.oab.contactless.packid.intent.Intent.ACTION_BADGE_UNLOCKED"
/* invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( c.p.a.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
/* .line 18 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).G ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->G()V
/* .line 19 */
(( c.b.k.r ) p0 ).invalidateOptionsMenu ( ); // invoke-virtual {p0}, Lc/b/k/r;->invalidateOptionsMenu()V
return;
} // .end method
public final void s ( ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
final String v1 = "BadgeListActivity"; // const-string v1, "BadgeListActivity"
/* .line 1 */
(( android.app.Activity ) p0 ).getSharedPreferences ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
final String v2 = "hasSeePermissionsActivity"; // const-string v2, "hasSeePermissionsActivity"
int v3 = 1; // const/4 v3, 0x1
v3 = /* .line 2 */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 3 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).M ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->M()V
/* .line 4 */
/* .line 5 */
} // :cond_0
/* const/16 v1, 0x1f */
/* if-lt v0, v1, :cond_1 */
final String v0 = "android.permission.BLUETOOTH_CONNECT"; // const-string v0, "android.permission.BLUETOOTH_CONNECT"
/* .line 6 */
v0 = e.h.b.a.h .a ( p0,v0 );
final String v1 = "android.permission.BLUETOOTH_SCAN"; // const-string v1, "android.permission.BLUETOOTH_SCAN"
/* .line 7 */
v1 = e.h.b.a.h .a ( p0,v1 );
/* .line 8 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).b ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/orange/hce/proto/activity/BadgeListActivity;->b(ZZ)V
} // :cond_1
/* const/16 v1, 0x1c */
/* if-gt v0, v1, :cond_2 */
final String v0 = "android.permission.ACCESS_COARSE_LOCATION"; // const-string v0, "android.permission.ACCESS_COARSE_LOCATION"
/* .line 9 */
v0 = e.h.b.a.h .a ( p0,v0 );
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->a(Z)V
} // :cond_2
final String v0 = "android.permission.ACCESS_FINE_LOCATION"; // const-string v0, "android.permission.ACCESS_FINE_LOCATION"
/* .line 10 */
v0 = e.h.b.a.h .a ( p0,v0 );
final String v1 = "android.permission.ACCESS_BACKGROUND_LOCATION"; // const-string v1, "android.permission.ACCESS_BACKGROUND_LOCATION"
/* .line 11 */
v1 = e.h.b.a.h .a ( p0,v1 );
/* .line 12 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/orange/hce/proto/activity/BadgeListActivity;->a(ZZ)V
} // :goto_0
return;
} // .end method
public final void t ( ) {
/* .locals 1 */
/* .line 1 */
(( android.app.Activity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
v0 = com.orange.business.packid.android.lib.PackIdUtility .isBluetoothEnabled ( v0 );
/* if-nez v0, :cond_0 */
/* .line 2 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).u ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->u()Lcom/google/android/material/snackbar/Snackbar;
(( com.google.android.material.snackbar.Snackbar ) v0 ).l ( ); // invoke-virtual {v0}, Lcom/google/android/material/snackbar/Snackbar;->l()V
/* .line 3 */
} // :cond_0
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).O ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->O()V
return;
} // .end method
public final com.google.android.material.snackbar.Snackbar u ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.I;
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = this.y;
/* const v1, 0x7f0e0058 */
int v2 = -2; // const/4 v2, -0x2
com.google.android.material.snackbar.Snackbar .a ( v0,v1,v2 );
this.I = v0;
/* const v1, 0x7f0e0024 */
/* .line 3 */
/* new-instance v2, Le/h/b/a/l/g; */
/* invoke-direct {v2, p0}, Le/h/b/a/l/g;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V */
(( com.google.android.material.snackbar.Snackbar ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/google/android/material/snackbar/Snackbar;->a(ILandroid/view/View$OnClickListener;)Lcom/google/android/material/snackbar/Snackbar;
/* .line 4 */
} // :cond_0
v0 = this.I;
} // .end method
public final com.google.android.material.snackbar.Snackbar v ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.J;
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = this.y;
/* const v1, 0x7f0e0144 */
int v2 = -2; // const/4 v2, -0x2
com.google.android.material.snackbar.Snackbar .a ( v0,v1,v2 );
this.J = v0;
/* const v1, 0x7f0e0039 */
/* .line 3 */
/* new-instance v2, Le/h/b/a/l/n; */
/* invoke-direct {v2, p0}, Le/h/b/a/l/n;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V */
(( com.google.android.material.snackbar.Snackbar ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/google/android/material/snackbar/Snackbar;->a(ILandroid/view/View$OnClickListener;)Lcom/google/android/material/snackbar/Snackbar;
/* .line 4 */
} // :cond_0
v0 = this.J;
} // .end method
public final java.lang.String w ( ) {
/* .locals 3 */
/* .line 1 */
try { // :try_start_0
(( android.app.Activity ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;
(( android.app.Activity ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
int v2 = 0; // const/4 v2, 0x0
(( android.content.pm.PackageManager ) v0 ).getPackageInfo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* .line 2 */
v0 = this.versionName;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* const v0, 0x7f0e0167 */
/* .line 3 */
(( android.app.Activity ) p0 ).getString ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;
/* .line 4 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Can\'t get version name, default to : "; // const-string v2, "Can\'t get version name, default to : "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v2 = "packid.BadgeList"; // const-string v2, "packid.BadgeList"
android.util.Log .e ( v2,v1 );
} // .end method
public final void x ( ) {
/* .locals 4 */
final String v0 = "packid.BadgeList"; // const-string v0, "packid.BadgeList"
final String v1 = "initializeUsers"; // const-string v1, "initializeUsers"
/* .line 1 */
android.util.Log .d ( v0,v1 );
/* .line 2 */
v1 = e.h.b.a.p.n .a ( );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
/* new-instance v0, Lcom/orange/business/packid/android/lib/PackId; */
/* invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
(( com.orange.business.packid.android.lib.PackId ) v0 ).clear ( ); // invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->clear()V
/* .line 4 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).N ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->N()V
/* const v0, 0x7f0e0130 */
/* .line 5 */
(( android.app.Activity ) p0 ).getString ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->b(Ljava/lang/String;)V
return;
/* .line 6 */
} // :cond_0
(( android.app.Activity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) v1 ).getData ( ); // invoke-virtual {v1}, Landroid/content/Intent;->getData()Landroid/net/Uri;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 7 */
(( android.app.Activity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
int v3 = 0; // const/4 v3, 0x0
(( android.content.Intent ) v2 ).setData ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
/* .line 8 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "initializeUsers with url "; // const-string v3, "initializeUsers with url "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v3 = ", registering"; // const-string v3, ", registering"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v2 );
/* const v0, 0x7f0e00c0 */
/* .line 9 */
(( android.app.Activity ) p0 ).getString ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;
/* const v2, 0x7f0e0118 */
(( android.app.Activity ) p0 ).getString ( v2 ); // invoke-virtual {p0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;
int v3 = 1; // const/4 v3, 0x1
android.app.ProgressDialog .show ( p0,v0,v2,v3 );
this.x = v0;
/* .line 10 */
/* new-instance v0, Ljava/lang/Thread; */
/* new-instance v2, Le/h/b/a/l/o; */
/* invoke-direct {v2, p0, v1}, Le/h/b/a/l/o;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;Landroid/net/Uri;)V */
/* invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
} // :cond_1
final String v1 = "initializeUsers no URL, showing current badges and refreshing"; // const-string v1, "initializeUsers no URL, showing current badges and refreshing"
/* .line 11 */
android.util.Log .v ( v0,v1 );
/* .line 12 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).N ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->N()V
int v0 = 0; // const/4 v0, 0x0
/* .line 13 */
(( com.orange.hce.proto.activity.BadgeListActivity ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->b(Z)V
} // :goto_0
return;
} // .end method
public final Boolean y ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.t;
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Landroid/app/AlertDialog; */
/* .line 2 */
v1 = (( android.app.AlertDialog ) v1 ).isShowing ( ); // invoke-virtual {v1}, Landroid/app/AlertDialog;->isShowing()Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void z ( ) { //synthethic
/* .locals 3 */
final String v0 = "packid.BadgeList"; // const-string v0, "packid.BadgeList"
final String v1 = "scheduleShowcaseDisplay"; // const-string v1, "scheduleShowcaseDisplay"
/* .line 1 */
android.util.Log .d ( v0,v1 );
/* .line 2 */
v0 = this.q;
v1 = this.B;
v2 = this.C;
e.h.b.a.k .a ( v0,v1,v2 );
return;
} // .end method

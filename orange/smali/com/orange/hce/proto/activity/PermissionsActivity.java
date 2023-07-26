public class com.orange.hce.proto.activity.PermissionsActivity extends c.b.k.r implements androidx.viewpager.widget.ViewPager$j {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final Integer x;
	 /* # instance fields */
	 public androidx.viewpager.widget.ViewPager q;
	 public c.y.a.a r;
	 public android.widget.TextView s;
	 public android.widget.TextView t;
	 public Boolean u;
	 public e.h.b.a.o.a v;
	 public final android.content.BroadcastReceiver w;
	 /* # direct methods */
	 public static com.orange.hce.proto.activity.PermissionsActivity ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 return;
	 } // .end method
	 public com.orange.hce.proto.activity.PermissionsActivity ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/b/k/r;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Lcom/orange/hce/proto/activity/PermissionsActivity$a; */
		 /* invoke-direct {v0, p0}, Lcom/orange/hce/proto/activity/PermissionsActivity$a;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V */
		 this.w = v0;
		 return;
	 } // .end method
	 public static androidx.viewpager.widget.ViewPager a ( com.orange.hce.proto.activity.PermissionsActivity p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = this.q;
	 } // .end method
	 public static Boolean a ( com.orange.hce.proto.activity.PermissionsActivity p0, Boolean p1 ) { //synthethic
		 /* .locals 0 */
		 /* .line 2 */
		 /* iput-boolean p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->u:Z */
	 } // .end method
	 public static Boolean b ( com.orange.hce.proto.activity.PermissionsActivity p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 /* iget-boolean p0, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->u:Z */
	 } // .end method
	 /* # virtual methods */
	 public final Boolean A ( ) {
		 /* .locals 1 */
		 final String v0 = "android.permission.BLUETOOTH_SCAN"; // const-string v0, "android.permission.BLUETOOTH_SCAN"
		 /* .line 1 */
		 v0 = 		 c.h.f.f .a ( p0,v0 );
		 /* if-nez v0, :cond_0 */
		 final String v0 = "android.permission.BLUETOOTH_CONNECT"; // const-string v0, "android.permission.BLUETOOTH_CONNECT"
		 /* .line 2 */
		 v0 = 		 c.h.f.f .a ( p0,v0 );
		 /* if-nez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final e.h.b.a.p.m B ( ) {
/* .locals 5 */
/* .line 1 */
/* new-instance v0, Le/h/b/a/p/m; */
/* invoke-direct {v0}, Le/h/b/a/p/m;-><init>()V */
/* .line 2 */
/* const/16 v2, 0x1f */
/* if-lt v1, v2, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
/* const/16 v2, 0x1d */
int v3 = 0; // const/4 v3, 0x0
int v4 = 1; // const/4 v4, 0x1
/* if-lt v1, v2, :cond_3 */
final String v1 = "android.permission.ACCESS_FINE_LOCATION"; // const-string v1, "android.permission.ACCESS_FINE_LOCATION"
/* .line 3 */
v1 = c.h.f.f .a ( p0,v1 );
/* if-nez v1, :cond_1 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
(( e.h.b.a.p.m ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/h/b/a/p/m;->b(Z)V
final String v1 = "android.permission.ACCESS_BACKGROUND_LOCATION"; // const-string v1, "android.permission.ACCESS_BACKGROUND_LOCATION"
/* .line 4 */
v1 = c.h.f.f .a ( p0,v1 );
/* if-nez v1, :cond_2 */
int v3 = 1; // const/4 v3, 0x1
} // :cond_2
(( e.h.b.a.p.m ) v0 ).a ( v3 ); // invoke-virtual {v0, v3}, Le/h/b/a/p/m;->a(Z)V
} // :cond_3
final String v1 = "android.permission.ACCESS_COARSE_LOCATION"; // const-string v1, "android.permission.ACCESS_COARSE_LOCATION"
/* .line 5 */
v1 = c.h.f.f .a ( p0,v1 );
/* if-nez v1, :cond_4 */
int v3 = 1; // const/4 v3, 0x1
} // :cond_4
(( e.h.b.a.p.m ) v0 ).b ( v3 ); // invoke-virtual {v0, v3}, Le/h/b/a/p/m;->b(Z)V
/* .line 6 */
(( e.h.b.a.p.m ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Le/h/b/a/p/m;->a(Z)V
} // .end method
public void C ( ) {
/* .locals 3 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "BatteryLife" */
/* } */
} // .end annotation
/* .line 1 */
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_0 */
final String v0 = "PermissionsActivity"; // const-string v0, "PermissionsActivity"
final String v1 = "BLE-OPTIMIZATIONS: ask user to ignore battery optimization for Pack ID"; // const-string v1, "BLE-OPTIMIZATIONS: ask user to ignore battery optimization for Pack ID"
/* .line 2 */
android.util.Log .i ( v0,v1 );
/* .line 3 */
/* new-instance v0, Landroid/content/Intent; */
/* invoke-direct {v0}, Landroid/content/Intent;-><init>()V */
final String v1 = "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"; // const-string v1, "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"
/* .line 4 */
(( android.content.Intent ) v0 ).setAction ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
/* .line 5 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "package:"; // const-string v2, "package:"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.app.Activity ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.net.Uri .parse ( v1 );
(( android.content.Intent ) v0 ).setData ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
int v1 = 1; // const/4 v1, 0x1
/* .line 6 */
(( androidx.activity.ComponentActivity ) p0 ).startActivityForResult ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V
} // :cond_0
return;
} // .end method
public final void D ( ) {
/* .locals 2 */
final String v0 = "PermissionsActivity"; // const-string v0, "PermissionsActivity"
final String v1 = "Start next activity"; // const-string v1, "Start next activity"
/* .line 1 */
android.util.Log .i ( v0,v1 );
/* .line 2 */
/* new-instance v0, Landroid/content/Intent; */
/* const-class v1, Lcom/orange/hce/proto/activity/BadgeListActivity; */
/* invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 3 */
(( android.app.Activity ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
/* .line 4 */
(( android.app.Activity ) p0 ).finish ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finish()V
return;
} // .end method
public void a ( Integer p0, Float p1, Integer p2 ) {
/* .locals 0 */
return;
} // .end method
public void a ( android.view.View p0 ) { //synthethic
/* .locals 0 */
/* .line 3 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).onBackPressed ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->onBackPressed()V
return;
} // .end method
public final void a ( android.widget.ImageView p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .line 4 */
c.h.f.f .b ( p0,p2 );
(( android.widget.ImageView ) p1 ).setImageTintList ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V
/* .line 5 */
(( android.widget.ImageView ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* .line 6 */
v0 = (( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).f ( p3 ); // invoke-virtual {p0, p3}, Lcom/orange/hce/proto/activity/PermissionsActivity;->f(I)I
/* iput v0, p2, Landroid/view/ViewGroup$LayoutParams;->height:I */
/* .line 7 */
p3 = (( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).f ( p3 ); // invoke-virtual {p0, p3}, Lcom/orange/hce/proto/activity/PermissionsActivity;->f(I)I
/* iput p3, p2, Landroid/view/ViewGroup$LayoutParams;->width:I */
/* .line 8 */
(( android.widget.ImageView ) p1 ).setLayoutParams ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
return;
} // .end method
public void b ( Integer p0 ) {
/* .locals 0 */
return;
} // .end method
public void b ( android.view.View p0 ) { //synthethic
/* .locals 0 */
/* .line 2 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).z ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V
return;
} // .end method
public void c ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).h ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->h(I)V
return;
} // .end method
public void c ( android.view.View p0 ) { //synthethic
/* .locals 0 */
/* .line 2 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).u ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->u()V
return;
} // .end method
public void d ( android.view.View p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).z ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V
return;
} // .end method
public final void e ( Integer p0 ) {
/* .locals 1 */
/* const/16 v0, 0xb */
/* if-eq p1, v0, :cond_0 */
/* .line 1 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).z ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V
} // :cond_0
/* const/16 p1, 0x2b67 */
/* .line 2 */
e.h.b.a.h .a ( p0,p1 );
} // :goto_0
return;
} // .end method
public void e ( android.view.View p0 ) { //synthethic
/* .locals 0 */
/* .line 3 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).y ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->y()V
return;
} // .end method
public final Integer f ( Integer p0 ) {
/* .locals 2 */
/* int-to-float p1, p1 */
/* .line 1 */
(( c.b.k.r ) p0 ).getResources ( ); // invoke-virtual {p0}, Lc/b/k/r;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
int v1 = 1; // const/4 v1, 0x1
p1 = android.util.TypedValue .applyDimension ( v1,p1,v0 );
p1 = java.lang.Math .round ( p1 );
} // .end method
public void f ( android.view.View p0 ) { //synthethic
/* .locals 0 */
/* const/16 p1, 0x79 */
/* .line 2 */
e.h.b.a.p.k .a ( p0,p1 );
return;
} // .end method
public final void g ( Integer p0 ) {
/* .locals 11 */
/* const v0, 0x7f0800b4 */
/* .line 1 */
(( c.b.k.r ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/ImageView; */
/* const/16 v1, 0xa */
/* const v2, 0x7f05005d */
/* .line 2 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).a ( v0, v2, v1 ); // invoke-virtual {p0, v0, v2, v1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->a(Landroid/widget/ImageView;II)V
/* const v3, 0x7f0800b5 */
/* .line 3 */
(( c.b.k.r ) p0 ).findViewById ( v3 ); // invoke-virtual {p0, v3}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* check-cast v3, Landroid/widget/ImageView; */
/* .line 4 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).a ( v3, v2, v1 ); // invoke-virtual {p0, v3, v2, v1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->a(Landroid/widget/ImageView;II)V
/* const v4, 0x7f0800b6 */
/* .line 5 */
(( c.b.k.r ) p0 ).findViewById ( v4 ); // invoke-virtual {p0, v4}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* check-cast v4, Landroid/widget/ImageView; */
/* .line 6 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).a ( v4, v2, v1 ); // invoke-virtual {p0, v4, v2, v1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->a(Landroid/widget/ImageView;II)V
/* const v5, 0x7f0800b7 */
/* .line 7 */
(( c.b.k.r ) p0 ).findViewById ( v5 ); // invoke-virtual {p0, v5}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* check-cast v5, Landroid/widget/ImageView; */
/* .line 8 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).a ( v5, v2, v1 ); // invoke-virtual {p0, v5, v2, v1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->a(Landroid/widget/ImageView;II)V
/* const v1, 0x7f0e0113 */
/* const/16 v2, 0x1f */
/* const v6, 0x7f0e0055 */
/* const/16 v7, 0xd */
/* const v8, 0x7f050026 */
/* if-nez p1, :cond_1 */
/* .line 9 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).a ( v0, v8, v7 ); // invoke-virtual {p0, v0, v8, v7}, Lcom/orange/hce/proto/activity/PermissionsActivity;->a(Landroid/widget/ImageView;II)V
/* .line 10 */
p1 = this.s;
int v0 = 4; // const/4 v0, 0x4
(( android.widget.TextView ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V
/* .line 11 */
p1 = this.t;
/* if-lt v0, v2, :cond_0 */
/* const v1, 0x7f0e0055 */
} // :cond_0
(( android.widget.TextView ) p1 ).setText ( v1 ); // invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
/* const v9, 0x7f0e010d */
int v10 = 0; // const/4 v10, 0x0
/* if-ne p1, v0, :cond_2 */
/* .line 12 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).a ( v3, v8, v7 ); // invoke-virtual {p0, v3, v8, v7}, Lcom/orange/hce/proto/activity/PermissionsActivity;->a(Landroid/widget/ImageView;II)V
/* .line 13 */
p1 = this.s;
(( android.widget.TextView ) p1 ).setVisibility ( v10 ); // invoke-virtual {p1, v10}, Landroid/widget/TextView;->setVisibility(I)V
/* .line 14 */
p1 = this.s;
(( android.widget.TextView ) p1 ).setText ( v6 ); // invoke-virtual {p1, v6}, Landroid/widget/TextView;->setText(I)V
/* .line 15 */
p1 = this.t;
(( android.widget.TextView ) p1 ).setText ( v9 ); // invoke-virtual {p1, v9}, Landroid/widget/TextView;->setText(I)V
} // :cond_2
int v0 = 2; // const/4 v0, 0x2
/* if-ne p1, v0, :cond_4 */
/* .line 16 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).a ( v4, v8, v7 ); // invoke-virtual {p0, v4, v8, v7}, Lcom/orange/hce/proto/activity/PermissionsActivity;->a(Landroid/widget/ImageView;II)V
/* .line 17 */
p1 = this.s;
(( android.widget.TextView ) p1 ).setVisibility ( v10 ); // invoke-virtual {p1, v10}, Landroid/widget/TextView;->setVisibility(I)V
/* .line 18 */
p1 = this.s;
/* if-lt v0, v2, :cond_3 */
/* const v1, 0x7f0e0055 */
} // :cond_3
(( android.widget.TextView ) p1 ).setText ( v1 ); // invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V
/* .line 19 */
p1 = this.t;
/* const v0, 0x7f0e0103 */
(( android.widget.TextView ) p1 ).setText ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V
/* .line 20 */
} // :cond_4
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).a ( v5, v8, v7 ); // invoke-virtual {p0, v5, v8, v7}, Lcom/orange/hce/proto/activity/PermissionsActivity;->a(Landroid/widget/ImageView;II)V
/* .line 21 */
p1 = this.s;
(( android.widget.TextView ) p1 ).setText ( v9 ); // invoke-virtual {p1, v9}, Landroid/widget/TextView;->setText(I)V
/* .line 22 */
p1 = this.t;
/* const v0, 0x7f0e0081 */
(( android.widget.TextView ) p1 ).setText ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V
} // :goto_0
return;
} // .end method
public void g ( android.view.View p0 ) { //synthethic
/* .locals 0 */
/* .line 23 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).D ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->D()V
return;
} // .end method
public void h ( Integer p0 ) {
/* .locals 12 */
/* .line 1 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).g ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->g(I)V
/* const v0, 0x7f080100 */
/* .line 2 */
(( c.b.k.r ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/TextView; */
/* const v1, 0x7f0800ca */
/* .line 3 */
(( c.b.k.r ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/Button; */
/* const v2, 0x7f08010c */
/* .line 4 */
(( c.b.k.r ) p0 ).findViewById ( v2 ); // invoke-virtual {p0, v2}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* check-cast v2, Landroid/widget/Button; */
/* .line 5 */
v3 = com.orange.hce.proto.activity.PermissionsActivity$b.a;
v4 = this.v;
/* aget-object p1, v4, p1 */
(( e.h.b.a.o.a ) p1 ).z0 ( ); // invoke-virtual {p1}, Le/h/b/a/o/a;->z0()Le/h/b/a/o/a$a;
p1 = (( java.lang.Enum ) p1 ).ordinal ( ); // invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I
/* aget p1, v3, p1 */
int v3 = 1; // const/4 v3, 0x1
/* const v4, 0x7f0e00fd */
/* const v5, 0x7f050058 */
/* const v6, 0x7f0700a0 */
/* const v7, 0x7f050095 */
/* const v8, 0x7f07009f */
/* const v9, 0x7f0e0116 */
int v10 = 4; // const/4 v10, 0x4
int v11 = 0; // const/4 v11, 0x0
/* if-eq p1, v3, :cond_b */
int v3 = 2; // const/4 v3, 0x2
/* if-eq p1, v3, :cond_9 */
int v3 = 3; // const/4 v3, 0x3
/* if-eq p1, v3, :cond_5 */
/* if-eq p1, v10, :cond_2 */
int v3 = 5; // const/4 v3, 0x5
/* if-eq p1, v3, :cond_0 */
/* goto/16 :goto_0 */
/* .line 6 */
} // :cond_0
(( android.widget.Button ) v2 ).setText ( v4 ); // invoke-virtual {v2, v4}, Landroid/widget/Button;->setText(I)V
/* .line 7 */
(( android.widget.Button ) v1 ).setText ( v9 ); // invoke-virtual {v1, v9}, Landroid/widget/Button;->setText(I)V
/* .line 8 */
/* new-instance p1, Le/h/b/a/l/k0; */
/* invoke-direct {p1, p0}, Le/h/b/a/l/k0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V */
(( android.widget.Button ) v1 ).setOnClickListener ( p1 ); // invoke-virtual {v1, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 9 */
/* new-instance p1, Le/h/b/a/l/i0; */
/* invoke-direct {p1, p0}, Le/h/b/a/l/i0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V */
(( android.widget.Button ) v2 ).setOnClickListener ( p1 ); // invoke-virtual {v2, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 10 */
p1 = e.h.b.a.p.k .a ( p0 );
if ( p1 != null) { // if-eqz p1, :cond_1
/* const p1, 0x7f0e0110 */
/* .line 11 */
(( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V
/* .line 12 */
(( android.widget.Button ) v2 ).setVisibility ( v10 ); // invoke-virtual {v2, v10}, Landroid/widget/Button;->setVisibility(I)V
/* .line 13 */
(( android.widget.TextView ) v0 ).setCompoundDrawablesWithIntrinsicBounds ( v6, v11, v11, v11 ); // invoke-virtual {v0, v6, v11, v11, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V
/* .line 14 */
p1 = c.h.f.f .a ( p0,v5 );
(( android.widget.TextView ) v0 ).setTextColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V
/* goto/16 :goto_0 */
} // :cond_1
/* const p1, 0x7f0e010f */
/* .line 15 */
(( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V
/* .line 16 */
(( android.widget.Button ) v2 ).setVisibility ( v11 ); // invoke-virtual {v2, v11}, Landroid/widget/Button;->setVisibility(I)V
/* .line 17 */
(( android.widget.TextView ) v0 ).setCompoundDrawablesWithIntrinsicBounds ( v8, v11, v11, v11 ); // invoke-virtual {v0, v8, v11, v11, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V
/* .line 18 */
p1 = c.h.f.f .a ( p0,v7 );
(( android.widget.TextView ) v0 ).setTextColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V
/* goto/16 :goto_0 */
/* .line 19 */
} // :cond_2
/* const/16 v3, 0x17 */
/* if-lt p1, v3, :cond_4 */
/* const p1, 0x7f0e0081 */
/* .line 20 */
(( android.widget.Button ) v1 ).setText ( p1 ); // invoke-virtual {v1, p1}, Landroid/widget/Button;->setText(I)V
/* .line 21 */
/* new-instance p1, Le/h/b/a/l/f0; */
/* invoke-direct {p1, p0}, Le/h/b/a/l/f0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V */
(( android.widget.Button ) v1 ).setOnClickListener ( p1 ); // invoke-virtual {v1, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 22 */
(( android.widget.Button ) v2 ).setText ( v4 ); // invoke-virtual {v2, v4}, Landroid/widget/Button;->setText(I)V
/* .line 23 */
/* new-instance p1, Le/h/b/a/l/g0; */
/* invoke-direct {p1, p0}, Le/h/b/a/l/g0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V */
(( android.widget.Button ) v2 ).setOnClickListener ( p1 ); // invoke-virtual {v2, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
final String p1 = "power"; // const-string p1, "power"
/* .line 24 */
(( android.app.Activity ) p0 ).getSystemService ( p1 ); // invoke-virtual {p0, p1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast p1, Landroid/os/PowerManager; */
if ( p1 != null) { // if-eqz p1, :cond_3
(( android.app.Activity ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
p1 = (( android.os.PowerManager ) p1 ).isIgnoringBatteryOptimizations ( v1 ); // invoke-virtual {p1, v1}, Landroid/os/PowerManager;->isIgnoringBatteryOptimizations(Ljava/lang/String;)Z
if ( p1 != null) { // if-eqz p1, :cond_3
/* const p1, 0x7f0e0102 */
/* .line 25 */
(( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V
/* .line 26 */
(( android.widget.TextView ) v0 ).setCompoundDrawablesWithIntrinsicBounds ( v6, v11, v11, v11 ); // invoke-virtual {v0, v6, v11, v11, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V
/* .line 27 */
p1 = c.h.f.f .a ( p0,v5 );
(( android.widget.TextView ) v0 ).setTextColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V
/* .line 28 */
(( android.widget.Button ) v2 ).setText ( v9 ); // invoke-virtual {v2, v9}, Landroid/widget/Button;->setText(I)V
/* .line 29 */
/* new-instance p1, Le/h/b/a/l/d0; */
/* invoke-direct {p1, p0}, Le/h/b/a/l/d0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V */
(( android.widget.Button ) v2 ).setOnClickListener ( p1 ); // invoke-virtual {v2, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* goto/16 :goto_0 */
} // :cond_3
/* const p1, 0x7f0e0104 */
/* .line 30 */
(( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V
/* .line 31 */
(( android.widget.Button ) v2 ).setVisibility ( v11 ); // invoke-virtual {v2, v11}, Landroid/widget/Button;->setVisibility(I)V
/* .line 32 */
(( android.widget.TextView ) v0 ).setCompoundDrawablesWithIntrinsicBounds ( v8, v11, v11, v11 ); // invoke-virtual {v0, v8, v11, v11, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V
/* .line 33 */
p1 = c.h.f.f .a ( p0,v7 );
(( android.widget.TextView ) v0 ).setTextColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V
/* goto/16 :goto_0 */
/* .line 34 */
} // :cond_4
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).z ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V
/* goto/16 :goto_0 */
/* .line 35 */
} // :cond_5
(( android.widget.Button ) v1 ).setText ( v9 ); // invoke-virtual {v1, v9}, Landroid/widget/Button;->setText(I)V
/* .line 36 */
(( android.widget.Button ) v2 ).setText ( v4 ); // invoke-virtual {v2, v4}, Landroid/widget/Button;->setText(I)V
/* .line 37 */
/* new-instance p1, Le/h/b/a/l/o0; */
/* invoke-direct {p1, p0}, Le/h/b/a/l/o0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V */
(( android.widget.Button ) v1 ).setOnClickListener ( p1 ); // invoke-virtual {v1, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 38 */
/* new-instance p1, Le/h/b/a/l/c0; */
/* invoke-direct {p1, p0}, Le/h/b/a/l/c0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V */
(( android.widget.Button ) v2 ).setOnClickListener ( p1 ); // invoke-virtual {v2, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 39 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).B ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->B()Le/h/b/a/p/m;
/* if-nez p1, :cond_6 */
return;
/* .line 40 */
} // :cond_6
v1 = (( e.h.b.a.p.m ) p1 ).b ( ); // invoke-virtual {p1}, Le/h/b/a/p/m;->b()Z
/* if-nez v1, :cond_7 */
/* const p1, 0x7f0e0114 */
/* .line 41 */
(( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V
/* .line 42 */
(( android.widget.Button ) v2 ).setVisibility ( v11 ); // invoke-virtual {v2, v11}, Landroid/widget/Button;->setVisibility(I)V
/* .line 43 */
(( android.widget.TextView ) v0 ).setCompoundDrawablesWithIntrinsicBounds ( v8, v11, v11, v11 ); // invoke-virtual {v0, v8, v11, v11, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V
/* .line 44 */
p1 = c.h.f.f .a ( p0,v7 );
(( android.widget.TextView ) v0 ).setTextColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V
/* goto/16 :goto_0 */
/* .line 45 */
} // :cond_7
p1 = (( e.h.b.a.p.m ) p1 ).a ( ); // invoke-virtual {p1}, Le/h/b/a/p/m;->a()Z
if ( p1 != null) { // if-eqz p1, :cond_8
/* const p1, 0x7f0e0112 */
/* .line 46 */
(( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V
/* .line 47 */
(( android.widget.Button ) v2 ).setVisibility ( v10 ); // invoke-virtual {v2, v10}, Landroid/widget/Button;->setVisibility(I)V
/* .line 48 */
(( android.widget.TextView ) v0 ).setCompoundDrawablesWithIntrinsicBounds ( v6, v11, v11, v11 ); // invoke-virtual {v0, v6, v11, v11, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V
/* .line 49 */
p1 = c.h.f.f .a ( p0,v5 );
(( android.widget.TextView ) v0 ).setTextColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V
/* goto/16 :goto_0 */
} // :cond_8
/* const p1, 0x7f0e0115 */
/* .line 50 */
(( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V
/* .line 51 */
(( android.widget.Button ) v2 ).setVisibility ( v11 ); // invoke-virtual {v2, v11}, Landroid/widget/Button;->setVisibility(I)V
/* const p1, 0x7f0700bc */
/* .line 52 */
(( android.widget.TextView ) v0 ).setCompoundDrawablesWithIntrinsicBounds ( p1, v11, v11, v11 ); // invoke-virtual {v0, p1, v11, v11, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V
/* const p1, 0x7f0500ad */
/* .line 53 */
p1 = c.h.f.f .a ( p0,p1 );
(( android.widget.TextView ) v0 ).setTextColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V
/* goto/16 :goto_0 */
/* .line 54 */
} // :cond_9
(( android.widget.Button ) v1 ).setText ( v9 ); // invoke-virtual {v1, v9}, Landroid/widget/Button;->setText(I)V
/* .line 55 */
/* new-instance p1, Le/h/b/a/l/p0; */
/* invoke-direct {p1, p0}, Le/h/b/a/l/p0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V */
(( android.widget.Button ) v1 ).setOnClickListener ( p1 ); // invoke-virtual {v1, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 56 */
/* new-instance p1, Le/h/b/a/l/n0; */
/* invoke-direct {p1, p0}, Le/h/b/a/l/n0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V */
(( android.widget.Button ) v2 ).setOnClickListener ( p1 ); // invoke-virtual {v2, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* const p1, 0x7f0e00fe */
/* .line 57 */
(( android.widget.Button ) v2 ).setText ( p1 ); // invoke-virtual {v2, p1}, Landroid/widget/Button;->setText(I)V
/* .line 58 */
(( android.app.Activity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
p1 = com.orange.business.packid.android.lib.PackIdUtility .isBluetoothEnabled ( p1 );
if ( p1 != null) { // if-eqz p1, :cond_a
/* const p1, 0x7f0e0109 */
/* .line 59 */
(( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V
/* .line 60 */
(( android.widget.Button ) v2 ).setVisibility ( v10 ); // invoke-virtual {v2, v10}, Landroid/widget/Button;->setVisibility(I)V
/* .line 61 */
(( android.widget.TextView ) v0 ).setCompoundDrawablesWithIntrinsicBounds ( v6, v11, v11, v11 ); // invoke-virtual {v0, v6, v11, v11, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V
/* .line 62 */
p1 = c.h.f.f .a ( p0,v5 );
(( android.widget.TextView ) v0 ).setTextColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V
} // :cond_a
/* const p1, 0x7f0e0108 */
/* .line 63 */
(( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V
/* .line 64 */
(( android.widget.Button ) v2 ).setVisibility ( v11 ); // invoke-virtual {v2, v11}, Landroid/widget/Button;->setVisibility(I)V
/* .line 65 */
(( android.widget.TextView ) v0 ).setCompoundDrawablesWithIntrinsicBounds ( v8, v11, v11, v11 ); // invoke-virtual {v0, v8, v11, v11, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V
/* .line 66 */
p1 = c.h.f.f .a ( p0,v7 );
(( android.widget.TextView ) v0 ).setTextColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V
} // :cond_b
/* const p1, 0x7f0e010c */
/* .line 67 */
(( android.widget.Button ) v1 ).setText ( p1 ); // invoke-virtual {v1, p1}, Landroid/widget/Button;->setText(I)V
/* .line 68 */
/* new-instance p1, Le/h/b/a/l/h0; */
/* invoke-direct {p1, p0}, Le/h/b/a/l/h0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V */
(( android.widget.Button ) v1 ).setOnClickListener ( p1 ); // invoke-virtual {v1, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 69 */
/* new-instance p1, Le/h/b/a/l/e0; */
/* invoke-direct {p1, p0}, Le/h/b/a/l/e0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V */
(( android.widget.Button ) v2 ).setOnClickListener ( p1 ); // invoke-virtual {v2, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 70 */
(( android.widget.Button ) v2 ).setText ( v4 ); // invoke-virtual {v2, v4}, Landroid/widget/Button;->setText(I)V
/* .line 71 */
p1 = (( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).A ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->A()Z
if ( p1 != null) { // if-eqz p1, :cond_c
/* .line 72 */
(( android.widget.Button ) v1 ).setText ( v9 ); // invoke-virtual {v1, v9}, Landroid/widget/Button;->setText(I)V
/* .line 73 */
/* new-instance p1, Le/h/b/a/l/j0; */
/* invoke-direct {p1, p0}, Le/h/b/a/l/j0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V */
(( android.widget.Button ) v1 ).setOnClickListener ( p1 ); // invoke-virtual {v1, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* const p1, 0x7f0e0105 */
/* .line 74 */
(( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V
/* .line 75 */
(( android.widget.Button ) v2 ).setVisibility ( v10 ); // invoke-virtual {v2, v10}, Landroid/widget/Button;->setVisibility(I)V
/* .line 76 */
(( android.widget.TextView ) v0 ).setCompoundDrawablesWithIntrinsicBounds ( v6, v11, v11, v11 ); // invoke-virtual {v0, v6, v11, v11, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V
/* .line 77 */
p1 = c.h.f.f .a ( p0,v5 );
(( android.widget.TextView ) v0 ).setTextColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V
} // :cond_c
/* const p1, 0x7f0e0106 */
/* .line 78 */
(( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V
/* .line 79 */
(( android.widget.Button ) v2 ).setVisibility ( v11 ); // invoke-virtual {v2, v11}, Landroid/widget/Button;->setVisibility(I)V
/* .line 80 */
(( android.widget.TextView ) v0 ).setCompoundDrawablesWithIntrinsicBounds ( v8, v11, v11, v11 ); // invoke-virtual {v0, v8, v11, v11, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V
/* .line 81 */
p1 = c.h.f.f .a ( p0,v7 );
(( android.widget.TextView ) v0 ).setTextColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V
} // :goto_0
return;
} // .end method
public void h ( android.view.View p0 ) { //synthethic
/* .locals 0 */
/* .line 82 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).s ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->s()V
return;
} // .end method
public void i ( android.view.View p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).z ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V
return;
} // .end method
public void j ( android.view.View p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).z ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V
return;
} // .end method
public void k ( android.view.View p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).v ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->v()V
return;
} // .end method
public void l ( android.view.View p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).x ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->x()V
return;
} // .end method
public void m ( android.view.View p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).t ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->t()V
return;
} // .end method
public void n ( android.view.View p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).w ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->w()V
return;
} // .end method
public void onActivityResult ( Integer p0, Integer p1, android.content.Intent p2 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1, p2, p3}, Lc/l/d/f0;->onActivityResult(IILandroid/content/Intent;)V */
int p3 = 1; // const/4 p3, 0x1
/* if-ne p1, p3, :cond_0 */
/* .line 2 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).e ( p3 ); // invoke-virtual {p0, p3}, Lcom/orange/hce/proto/activity/PermissionsActivity;->e(I)V
} // :cond_0
/* const/16 v0, 0x79 */
/* if-ne p1, v0, :cond_1 */
int p1 = 2; // const/4 p1, 0x2
/* .line 3 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).h ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->h(I)V
/* .line 4 */
p1 = e.h.b.a.p.k .a ( p0 );
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 5 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).z ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V
} // :cond_1
/* const/16 v0, 0x29a */
/* if-ne p1, v0, :cond_3 */
int p1 = -1; // const/4 p1, -0x1
/* if-ne p2, p1, :cond_2 */
/* .line 6 */
/* iput-boolean p3, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->u:Z */
/* .line 7 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).z ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
/* .line 8 */
/* iput-boolean p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->u:Z */
} // :cond_3
} // :goto_0
return;
} // .end method
public void onBackPressed ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.q;
v0 = (( androidx.viewpager.widget.ViewPager ) v0 ).getCurrentItem ( ); // invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I
/* if-nez v0, :cond_0 */
/* .line 2 */
/* invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V */
/* .line 3 */
} // :cond_0
v0 = this.q;
v1 = (( androidx.viewpager.widget.ViewPager ) v0 ).getCurrentItem ( ); // invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I
/* add-int/lit8 v1, v1, -0x1 */
(( androidx.viewpager.widget.ViewPager ) v0 ).setCurrentItem ( v1 ); // invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V
} // :goto_0
return;
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 6 */
/* .line 1 */
/* invoke-super {p0, p1}, Lc/b/k/r;->onCreate(Landroid/os/Bundle;)V */
/* const p1, 0x7f0b0023 */
/* .line 2 */
(( c.b.k.r ) p0 ).setContentView ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->setContentView(I)V
/* .line 3 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "onCreate on OS_VERSION "; // const-string v0, "onCreate on OS_VERSION "
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "PermissionsActivity"; // const-string v0, "PermissionsActivity"
android.util.Log .i ( v0,p1 );
/* .line 4 */
int v0 = 3; // const/4 v0, 0x3
int v1 = 2; // const/4 v1, 0x2
int v2 = 1; // const/4 v2, 0x1
int v3 = 0; // const/4 v3, 0x0
int v4 = 4; // const/4 v4, 0x4
/* const/16 v5, 0x1f */
/* if-lt p1, v5, :cond_0 */
/* new-array p1, v4, [Le/h/b/a/o/a; */
/* .line 5 */
e.h.b.a.o.a .A0 ( );
/* aput-object v4, p1, v3 */
e.h.b.a.o.a .C0 ( );
/* aput-object v3, p1, v2 */
e.h.b.a.o.a .D0 ( );
/* aput-object v2, p1, v1 */
e.h.b.a.o.a .B0 ( );
/* aput-object v1, p1, v0 */
this.v = p1;
} // :cond_0
/* new-array p1, v4, [Le/h/b/a/o/a; */
/* .line 6 */
e.h.b.a.o.a .C0 ( );
/* aput-object v4, p1, v3 */
e.h.b.a.o.a .E0 ( );
/* aput-object v3, p1, v2 */
e.h.b.a.o.a .D0 ( );
/* aput-object v2, p1, v1 */
e.h.b.a.o.a .B0 ( );
/* aput-object v1, p1, v0 */
this.v = p1;
/* .line 7 */
} // :goto_0
/* new-instance p1, Le/h/b/a/l/b1; */
(( c.l.d.f0 ) p0 ).j ( ); // invoke-virtual {p0}, Lc/l/d/f0;->j()Lc/l/d/o1;
v1 = this.v;
/* invoke-direct {p1, v0, v1}, Le/h/b/a/l/b1;-><init>(Lc/l/d/o1;[Landroidx/fragment/app/Fragment;)V */
this.r = p1;
/* const p1, 0x7f080197 */
/* .line 8 */
(( c.b.k.r ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* check-cast p1, Landroidx/viewpager/widget/ViewPager; */
this.q = p1;
/* .line 9 */
v0 = this.r;
(( androidx.viewpager.widget.ViewPager ) p1 ).setAdapter ( v0 ); // invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Lc/y/a/a;)V
/* .line 10 */
p1 = this.q;
(( androidx.viewpager.widget.ViewPager ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Landroidx/viewpager/widget/ViewPager;->a(Landroidx/viewpager/widget/ViewPager$j;)V
/* const p1, 0x7f080103 */
/* .line 11 */
(( c.b.k.r ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* check-cast p1, Landroid/widget/TextView; */
this.s = p1;
/* .line 12 */
/* new-instance v0, Le/h/b/a/l/m0; */
/* invoke-direct {v0, p0}, Le/h/b/a/l/m0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V */
(( android.widget.TextView ) p1 ).setOnClickListener ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* const p1, 0x7f0800ec */
/* .line 13 */
(( c.b.k.r ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* check-cast p1, Landroid/widget/TextView; */
this.t = p1;
/* .line 14 */
/* new-instance v0, Le/h/b/a/l/l0; */
/* invoke-direct {v0, p0}, Le/h/b/a/l/l0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V */
(( android.widget.TextView ) p1 ).setOnClickListener ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 15 */
p1 = this.q;
p1 = (( androidx.viewpager.widget.ViewPager ) p1 ).getCurrentItem ( ); // invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->c(I)V
return;
} // .end method
public void onRequestPermissionsResult ( Integer p0, java.lang.String[] p1, Integer[] p2 ) {
/* .locals 0 */
/* .line 1 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->e(I)V
return;
} // .end method
public void onResume ( ) {
/* .locals 3 */
/* .line 1 */
/* invoke-super {p0}, Lc/l/d/f0;->onResume()V */
/* .line 2 */
v0 = this.w;
/* new-instance v1, Landroid/content/IntentFilter; */
final String v2 = "android.bluetooth.adapter.action.STATE_CHANGED"; // const-string v2, "android.bluetooth.adapter.action.STATE_CHANGED"
/* invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( android.app.Activity ) p0 ).registerReceiver ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
return;
} // .end method
public void onStop ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Lc/b/k/r;->onStop()V */
/* .line 2 */
v0 = this.w;
(( android.app.Activity ) p0 ).unregisterReceiver ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
return;
} // .end method
public final void s ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).A ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->A()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).z ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V
return;
} // :cond_0
/* const/16 v0, 0x21 */
/* .line 3 */
e.h.b.a.h .a ( p0,v0 );
return;
} // .end method
public final void t ( ) {
/* .locals 4 */
/* .line 1 */
final String v1 = "android.permission.ACCESS_BACKGROUND_LOCATION"; // const-string v1, "android.permission.ACCESS_BACKGROUND_LOCATION"
/* const/16 v2, 0x1c */
/* const/16 v3, 0x1f */
/* if-ge v0, v3, :cond_3 */
/* if-lt v0, v2, :cond_3 */
final String v0 = "android.permission.ACCESS_FINE_LOCATION"; // const-string v0, "android.permission.ACCESS_FINE_LOCATION"
/* .line 2 */
v0 = c.h.f.f .a ( p0,v0 );
/* if-nez v0, :cond_0 */
v0 = c.h.f.f .a ( p0,v1 );
/* if-nez v0, :cond_0 */
/* .line 3 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).z ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V
return;
/* .line 4 */
} // :cond_0
/* if-ne v0, v2, :cond_1 */
/* const/16 v0, 0x457 */
/* .line 5 */
e.h.b.a.h .b ( p0,v0 );
} // :cond_1
/* const/16 v1, 0x1d */
/* if-ne v0, v1, :cond_2 */
/* const/16 v0, 0x6f */
/* .line 6 */
e.h.b.a.h .c ( p0,v0 );
} // :cond_2
/* const/16 v0, 0xb */
/* .line 7 */
e.h.b.a.h .b ( p0,v0 );
/* .line 8 */
} // :cond_3
/* if-ge v0, v2, :cond_5 */
final String v0 = "android.permission.ACCESS_COARSE_LOCATION"; // const-string v0, "android.permission.ACCESS_COARSE_LOCATION"
/* .line 9 */
v2 = c.h.f.f .a ( p0,v0 );
/* if-nez v2, :cond_4 */
v1 = c.h.f.f .a ( p0,v1 );
/* if-nez v1, :cond_4 */
/* .line 10 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).z ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V
return;
/* .line 11 */
} // :cond_4
/* filled-new-array {v0}, [Ljava/lang/String; */
int v1 = 1; // const/4 v1, 0x1
c.h.e.f .a ( p0,v0,v1 );
} // :cond_5
} // :goto_0
return;
} // .end method
public final void u ( ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).C ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->C()V
} // :cond_0
final String v0 = "PermissionsActivity"; // const-string v0, "PermissionsActivity"
final String v1 = "SDK is too low for permission: battery optimization"; // const-string v1, "SDK is too low for permission: battery optimization"
/* .line 3 */
android.util.Log .i ( v0,v1 );
/* .line 4 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).z ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V
} // :goto_0
return;
} // .end method
public final void v ( ) {
/* .locals 4 */
/* .line 1 */
(( android.app.Activity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
v0 = com.orange.business.packid.android.lib.PackIdUtility .isBluetoothEnabled ( v0 );
/* if-nez v0, :cond_1 */
/* .line 2 */
/* const/16 v1, 0x1f */
/* const/16 v2, 0x29a */
final String v3 = "android.bluetooth.adapter.action.REQUEST_ENABLE"; // const-string v3, "android.bluetooth.adapter.action.REQUEST_ENABLE"
/* if-lt v0, v1, :cond_0 */
final String v0 = "android.permission.BLUETOOTH_CONNECT"; // const-string v0, "android.permission.BLUETOOTH_CONNECT"
/* .line 3 */
v0 = c.h.f.f .a ( p0,v0 );
/* if-nez v0, :cond_1 */
/* .line 4 */
/* new-instance v0, Landroid/content/Intent; */
/* invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 5 */
(( androidx.activity.ComponentActivity ) p0 ).startActivityForResult ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V
/* .line 6 */
} // :cond_0
/* new-instance v0, Landroid/content/Intent; */
/* invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 7 */
(( androidx.activity.ComponentActivity ) p0 ).startActivityForResult ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V
} // :cond_1
} // :goto_0
return;
} // .end method
public final void w ( ) {
/* .locals 2 */
final String v0 = "PermissionsActivity"; // const-string v0, "PermissionsActivity"
final String v1 = "User deny to disable doze mode"; // const-string v1, "User deny to disable doze mode"
/* .line 1 */
android.util.Log .i ( v0,v1 );
/* .line 2 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).D ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->D()V
return;
} // .end method
public final void x ( ) {
/* .locals 2 */
final String v0 = "PermissionsActivity"; // const-string v0, "PermissionsActivity"
final String v1 = "User deny location"; // const-string v1, "User deny location"
/* .line 1 */
android.util.Log .i ( v0,v1 );
/* .line 2 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).z ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V
return;
} // .end method
public final void y ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.q;
v1 = this.r;
v1 = (( c.y.a.a ) v1 ).a ( ); // invoke-virtual {v1}, Lc/y/a/a;->a()I
/* add-int/lit8 v1, v1, -0x1 */
(( androidx.viewpager.widget.ViewPager ) v0 ).setCurrentItem ( v1 ); // invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V
return;
} // .end method
public void z ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.q;
v0 = (( androidx.viewpager.widget.ViewPager ) v0 ).getCurrentItem ( ); // invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I
/* add-int/lit8 v0, v0, 0x1 */
v1 = this.r;
v1 = (( c.y.a.a ) v1 ).a ( ); // invoke-virtual {v1}, Lc/y/a/a;->a()I
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
(( com.orange.hce.proto.activity.PermissionsActivity ) p0 ).D ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->D()V
/* .line 3 */
} // :cond_0
v0 = this.q;
v1 = (( androidx.viewpager.widget.ViewPager ) v0 ).getCurrentItem ( ); // invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I
/* add-int/lit8 v1, v1, 0x1 */
(( androidx.viewpager.widget.ViewPager ) v0 ).setCurrentItem ( v1 ); // invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V
} // :goto_0
return;
} // .end method

public class com.orange.hce.proto.activity.LogActivity extends c.b.k.r {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Integer B;
	 public static final Integer C;
	 /* # instance fields */
	 public android.widget.Switch A;
	 public final android.os.Handler q;
	 public android.content.BroadcastReceiver r;
	 public android.view.ViewGroup s;
	 public android.view.View t;
	 public android.view.Menu u;
	 public java.lang.Boolean v;
	 public e.h.b.a.l.a1 w;
	 public final com.orange.oab.contactless.packid.rssi.RssiCalibration x;
	 public final android.content.BroadcastReceiver y;
	 public android.widget.TextView z;
	 /* # direct methods */
	 public static com.orange.hce.proto.activity.LogActivity ( ) {
		 /* .locals 3 */
		 /* const/16 v0, 0x7f */
		 int v1 = 0; // const/4 v1, 0x0
		 /* const/16 v2, 0xff */
		 /* .line 1 */
		 v0 = 		 android.graphics.Color .rgb ( v0,v1,v2 );
		 /* const/16 v0, 0x33 */
		 /* const/16 v1, 0xb3 */
		 /* const/16 v2, 0xa6 */
		 /* .line 2 */
		 v0 = 		 android.graphics.Color .rgb ( v0,v1,v2 );
		 return;
	 } // .end method
	 public com.orange.hce.proto.activity.LogActivity ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/b/k/r;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Landroid/os/Handler; */
		 android.os.Looper .getMainLooper ( );
		 /* invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
		 this.q = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 java.lang.Boolean .valueOf ( v0 );
		 this.v = v0;
		 /* .line 4 */
		 /* new-instance v0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration; */
		 /* const/16 v1, 0x64 */
		 /* const/16 v2, 0x3c */
		 /* invoke-direct {v0, v1, v2}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;-><init>(II)V */
		 this.x = v0;
		 /* .line 5 */
		 (( com.orange.hce.proto.activity.LogActivity ) p0 ).s ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->s()Landroid/content/BroadcastReceiver;
		 this.y = v0;
		 return;
	 } // .end method
	 public static Float a ( Float p0, android.content.Context p1 ) { //synthethic
		 /* .locals 0 */
		 /* .line 4 */
		 p0 = 		 com.orange.hce.proto.activity.LogActivity .b ( p0,p1 );
	 } // .end method
	 public static com.orange.oab.contactless.packid.rssi.RssiCalibration a ( com.orange.hce.proto.activity.LogActivity p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = this.x;
	 } // .end method
	 public static e.h.b.a.l.e1 a ( com.orange.hce.proto.activity.LogActivity p0, fr.mbs.binary.Octets p1, fr.mbs.binary.Octets p2 ) { //synthethic
		 /* .locals 0 */
		 /* .line 5 */
		 (( com.orange.hce.proto.activity.LogActivity ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/orange/hce/proto/activity/LogActivity;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Le/h/b/a/l/e1;
	 } // .end method
	 public static java.lang.Boolean a ( com.orange.hce.proto.activity.LogActivity p0, java.lang.Boolean p1 ) { //synthethic
		 /* .locals 0 */
		 /* .line 2 */
		 this.v = p1;
	 } // .end method
	 public static void a ( com.orange.hce.proto.activity.LogActivity p0, android.widget.TextView p1, java.lang.String p2, Integer p3 ) { //synthethic
		 /* .locals 0 */
		 /* .line 3 */
		 (( com.orange.hce.proto.activity.LogActivity ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/orange/hce/proto/activity/LogActivity;->a(Landroid/widget/TextView;Ljava/lang/String;I)V
		 return;
	 } // .end method
	 public static Float b ( Float p0, android.content.Context p1 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 /* .line 3 */
		 (( android.content.res.Resources ) p1 ).getDisplayMetrics ( ); // invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 /* .line 4 */
		 /* iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I */
		 /* int-to-float p1, p1 */
		 /* const/high16 v0, 0x43200000 # 160.0f */
		 /* div-float/2addr p1, v0 */
		 /* mul-float p0, p0, p1 */
	 } // .end method
	 public static java.lang.Boolean b ( com.orange.hce.proto.activity.LogActivity p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = this.v;
	 } // .end method
	 public static e.h.b.a.l.a1 c ( com.orange.hce.proto.activity.LogActivity p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = this.w;
	 } // .end method
	 public static void d ( com.orange.hce.proto.activity.LogActivity p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 (( com.orange.hce.proto.activity.LogActivity ) p0 ).x ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->x()V
		 return;
	 } // .end method
	 public static android.view.ViewGroup e ( com.orange.hce.proto.activity.LogActivity p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = this.s;
	 } // .end method
	 public static android.os.Handler f ( com.orange.hce.proto.activity.LogActivity p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = this.q;
	 } // .end method
	 /* # virtual methods */
	 public final void A ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.w;
		 (( e.h.b.a.l.a1 ) v0 ).f ( ); // invoke-virtual {v0}, Le/h/b/a/l/a1;->f()Ljava/lang/Boolean;
		 v0 = 		 (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v0 = this.w;
			 final String v1 = "=== Informations ==="; // const-string v1, "=== Informations ==="
			 (( e.h.b.a.l.a1 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/h/b/a/l/a1;->a(Ljava/lang/String;)V
			 /* .line 3 */
		 } // :cond_0
		 (( com.orange.hce.proto.activity.LogActivity ) p0 ).B ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->B()V
		 /* const v0, 0x7f08004d */
		 /* const v1, 0x7f0e0036 */
		 /* .line 4 */
		 (( com.orange.hce.proto.activity.LogActivity ) p0 ).t ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->t()Ljava/lang/String;
		 (( com.orange.hce.proto.activity.LogActivity ) p0 ).a ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lcom/orange/hce/proto/activity/LogActivity;->a(IILjava/lang/String;)V
		 /* const v0, 0x7f08004e */
		 /* const v1, 0x7f0e0037 */
		 final String v2 = "2.51.3 (289)"; // const-string v2, "2.51.3 (289)"
		 /* .line 5 */
		 (( com.orange.hce.proto.activity.LogActivity ) p0 ).a ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lcom/orange/hce/proto/activity/LogActivity;->a(IILjava/lang/String;)V
		 /* const v0, 0x7f0800f8 */
		 /* const v1, 0x7f0e00ea */
		 /* .line 6 */
		 v2 = android.os.Build$VERSION.RELEASE;
		 (( com.orange.hce.proto.activity.LogActivity ) p0 ).a ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lcom/orange/hce/proto/activity/LogActivity;->a(IILjava/lang/String;)V
		 /* const v0, 0x7f08018f */
		 /* const v1, 0x7f0e0174 */
		 /* .line 7 */
		 (( com.orange.hce.proto.activity.LogActivity ) p0 ).v ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->v()Ljava/lang/String;
		 (( com.orange.hce.proto.activity.LogActivity ) p0 ).a ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lcom/orange/hce/proto/activity/LogActivity;->a(IILjava/lang/String;)V
		 /* const v0, 0x7f080078 */
		 /* const v1, 0x7f0e0080 */
		 /* .line 8 */
		 (( com.orange.hce.proto.activity.LogActivity ) p0 ).u ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->u()Ljava/lang/String;
		 (( com.orange.hce.proto.activity.LogActivity ) p0 ).a ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lcom/orange/hce/proto/activity/LogActivity;->a(IILjava/lang/String;)V
		 /* .line 9 */
		 (( com.orange.hce.proto.activity.LogActivity ) p0 ).w ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->w()V
		 /* .line 10 */
		 v0 = this.w;
		 (( e.h.b.a.l.a1 ) v0 ).f ( ); // invoke-virtual {v0}, Le/h/b/a/l/a1;->f()Ljava/lang/Boolean;
		 v0 = 		 (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 11 */
			 v0 = this.w;
			 final String v1 = "=== Logs ==="; // const-string v1, "=== Logs ==="
			 (( e.h.b.a.l.a1 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/h/b/a/l/a1;->a(Ljava/lang/String;)V
		 } // :cond_1
		 return;
	 } // .end method
	 public final void B ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 (( android.app.Activity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
		 final String v1 = "packid.app.preferences"; // const-string v1, "packid.app.preferences"
		 int v2 = 0; // const/4 v2, 0x0
		 (( android.content.Context ) v0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 final String v1 = "deviceModel"; // const-string v1, "deviceModel"
		 v2 = 		 /* .line 2 */
		 /* if-nez v2, :cond_0 */
		 /* .line 3 */
		 e.g.a.a.b .a ( p0 );
		 /* new-instance v3, Le/h/b/a/l/y; */
		 /* invoke-direct {v3, p0, v0}, Le/h/b/a/l/y;-><init>(Lcom/orange/hce/proto/activity/LogActivity;Landroid/content/SharedPreferences;)V */
		 (( e.g.a.a.b$c ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Le/g/a/a/b$c;->a(Le/g/a/a/b$a;)V
	 } // :cond_0
	 /* const v2, 0x7f0800e4 */
	 /* const v3, 0x7f0e0090 */
	 /* const v4, 0x7f0e0135 */
	 /* .line 4 */
	 (( android.app.Activity ) p0 ).getString ( v4 ); // invoke-virtual {p0, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;
	 (( com.orange.hce.proto.activity.LogActivity ) p0 ).a ( v2, v3, v0 ); // invoke-virtual {p0, v2, v3, v0}, Lcom/orange/hce/proto/activity/LogActivity;->a(IILjava/lang/String;)V
	 return;
} // .end method
public final void C ( ) {
	 /* .locals 3 */
	 /* const v0, 0x7f0800dd */
	 /* .line 1 */
	 (( c.b.k.r ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
	 /* check-cast v0, Landroidx/appcompat/widget/Toolbar; */
	 /* .line 2 */
	 (( c.b.k.r ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/r;->a(Landroidx/appcompat/widget/Toolbar;)V
	 /* .line 3 */
	 (( c.b.k.r ) p0 ).p ( ); // invoke-virtual {p0}, Lc/b/k/r;->p()Lc/b/k/a;
	 java.util.Objects .requireNonNull ( v1 );
	 /* check-cast v1, Lc/b/k/a; */
	 int v2 = 1; // const/4 v2, 0x1
	 (( c.b.k.a ) v1 ).d ( v2 ); // invoke-virtual {v1, v2}, Lc/b/k/a;->d(Z)V
	 /* const v1, 0x7f050026 */
	 /* .line 4 */
	 v2 = 	 c.h.f.f .a ( p0,v1 );
	 (( android.view.ViewGroup ) v0 ).setBackgroundColor ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setBackgroundColor(I)V
	 /* .line 5 */
	 /* const/16 v2, 0x15 */
	 /* if-lt v0, v2, :cond_0 */
	 /* .line 6 */
	 (( android.app.Activity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
	 v1 = 	 c.h.f.f .a ( p0,v1 );
	 (( android.view.Window ) v0 ).setStatusBarColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V
} // :cond_0
return;
} // .end method
public final android.content.BroadcastReceiver a ( android.widget.ScrollView p0 ) {
/* .locals 2 */
/* const v0, 0x7f080181 */
/* .line 8 */
(( c.b.k.r ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/TextView; */
/* .line 9 */
/* new-instance v1, Lcom/orange/hce/proto/activity/LogActivity$d; */
/* invoke-direct {v1, p0, v0, p1}, Lcom/orange/hce/proto/activity/LogActivity$d;-><init>(Lcom/orange/hce/proto/activity/LogActivity;Landroid/widget/TextView;Landroid/widget/ScrollView;)V */
} // .end method
public final e.h.b.a.l.e1 a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* .line 10 */
} // :goto_0
v1 = this.s;
v1 = (( android.view.ViewGroup ) v1 ).getChildCount ( ); // invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I
/* if-ge v0, v1, :cond_1 */
/* .line 11 */
v1 = this.s;
(( android.view.ViewGroup ) v1 ).getChildAt ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* check-cast v1, Le/h/b/a/l/e1; */
/* .line 12 */
v2 = (( e.h.b.a.l.e1 ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Le/h/b/a/l/e1;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final void a ( Integer p0, Integer p1, java.lang.String p2 ) {
/* .locals 2 */
/* .line 16 */
(( c.b.k.r ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* const v0, 0x7f080075 */
/* .line 17 */
(( android.view.View ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/TextView; */
(( android.widget.TextView ) v0 ).setText ( p2 ); // invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(I)V
/* const v0, 0x7f080076 */
/* .line 18 */
(( android.view.View ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast p1, Landroid/widget/TextView; */
(( android.widget.TextView ) p1 ).setText ( p3 ); // invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 19 */
p1 = this.w;
(( e.h.b.a.l.a1 ) p1 ).f ( ); // invoke-virtual {p1}, Le/h/b/a/l/a1;->f()Ljava/lang/Boolean;
p1 = (( java.lang.Boolean ) p1 ).booleanValue ( ); // invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 20 */
p1 = this.w;
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( c.b.k.r ) p0 ).getResources ( ); // invoke-virtual {p0}, Lc/b/k/r;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getString ( p2 ); // invoke-virtual {v1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.h.b.a.l.a1 ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/h/b/a/l/a1;->a(Ljava/lang/String;)V
} // :cond_0
return;
} // .end method
public void a ( android.content.SharedPreferences p0, e.g.a.a.b$b p1, java.lang.Exception p2 ) { //synthethic
/* .locals 1 */
/* .line 13 */
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
v0 = this.a;
(( java.lang.StringBuilder ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = " "; // const-string v0, " "
(( java.lang.StringBuilder ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = this.b;
(( java.lang.StringBuilder ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = " ("; // const-string v0, " ("
(( java.lang.StringBuilder ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p2 = this.d;
(( java.lang.StringBuilder ) p3 ).append ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p2 = ")"; // const-string p2, ")"
(( java.lang.StringBuilder ) p3 ).append ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 14 */
final String p3 = "deviceModel"; // const-string p3, "deviceModel"
/* const p1, 0x7f0800e4 */
/* const p3, 0x7f0e0090 */
/* .line 15 */
(( com.orange.hce.proto.activity.LogActivity ) p0 ).a ( p1, p3, p2 ); // invoke-virtual {p0, p1, p3, p2}, Lcom/orange/hce/proto/activity/LogActivity;->a(IILjava/lang/String;)V
return;
} // .end method
public void a ( android.view.Menu p0 ) {
/* .locals 1 */
/* const v0, 0x7f08012a */
/* .line 7 */
v0 = this.w;
v0 = (( e.h.b.a.l.a1 ) v0 ).g ( ); // invoke-virtual {v0}, Le/h/b/a/l/a1;->g()Z
return;
} // .end method
public void a ( android.widget.CompoundButton p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .line 6 */
(( android.app.Activity ) p0 ).getApplication ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;
/* check-cast p1, Lcom/orange/hce/proto/PackIdApp; */
(( com.orange.hce.proto.PackIdApp ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/orange/hce/proto/PackIdApp;->a()Lcom/orange/business/packid/android/lib/PackId;
(( com.orange.business.packid.android.lib.PackId ) p1 ).activatePersistentLogs ( p2 ); // invoke-virtual {p1, p2}, Lcom/orange/business/packid/android/lib/PackId;->activatePersistentLogs(Z)V
return;
} // .end method
public final void a ( android.widget.TextView p0, java.lang.String p1, Integer p2 ) {
/* .locals 2 */
/* .line 21 */
v0 = (( android.widget.TextView ) p1 ).getText ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;
/* .line 22 */
(( android.widget.TextView ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V
/* .line 23 */
p2 = (( android.widget.TextView ) p1 ).getText ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;
/* .line 24 */
(( android.widget.TextView ) p1 ).getText ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;
/* check-cast p1, Landroid/text/Spannable; */
/* .line 25 */
/* new-instance v1, Landroid/text/style/ForegroundColorSpan; */
/* invoke-direct {v1, p3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V */
int p3 = 0; // const/4 p3, 0x0
return;
} // .end method
public void e ( Integer p0 ) {
/* .locals 2 */
/* .line 2 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "com.orange.oab.contactless.packid.action.ACTION_SCAN_MODE"; // const-string v1, "com.orange.oab.contactless.packid.action.ACTION_SCAN_MODE"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
final String v1 = "readerAddress"; // const-string v1, "readerAddress"
/* .line 3 */
(( android.content.Intent ) v0 ).putExtra ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
/* .line 4 */
c.p.a.d .a ( p0 );
(( c.p.a.d ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/p/a/d;->a(Landroid/content/Intent;)Z
return;
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Lc/b/k/r;->onCreate(Landroid/os/Bundle;)V */
/* .line 2 */
/* new-instance p1, Le/h/b/a/l/a1; */
/* invoke-direct {p1, p0}, Le/h/b/a/l/a1;-><init>(Landroid/content/Context;)V */
this.w = p1;
/* .line 3 */
(( e.h.b.a.l.a1 ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Le/h/b/a/l/a1;->a(Landroid/app/Activity;)V
/* const p1, 0x7f0b0021 */
/* .line 4 */
(( c.b.k.r ) p0 ).setContentView ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->setContentView(I)V
/* const p1, 0x7f0800da */
/* .line 5 */
(( c.b.k.r ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* check-cast p1, Landroid/view/ViewGroup; */
this.s = p1;
/* const p1, 0x7f080071 */
/* .line 6 */
(( c.b.k.r ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
this.t = p1;
/* const p1, 0x7f080101 */
/* .line 7 */
(( c.b.k.r ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* check-cast p1, Landroid/widget/Switch; */
this.A = p1;
/* const p1, 0x7f080181 */
/* .line 8 */
(( c.b.k.r ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* check-cast p1, Landroid/widget/TextView; */
this.z = p1;
/* .line 9 */
(( com.orange.hce.proto.activity.LogActivity ) p0 ).z ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->z()V
/* .line 10 */
(( com.orange.hce.proto.activity.LogActivity ) p0 ).C ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->C()V
return;
} // .end method
public Boolean onCreateOptionsMenu ( android.view.Menu p0 ) {
/* .locals 2 */
/* .line 1 */
this.u = p1;
/* .line 2 */
(( c.b.k.r ) p0 ).getMenuInflater ( ); // invoke-virtual {p0}, Lc/b/k/r;->getMenuInflater()Landroid/view/MenuInflater;
/* const v1, 0x7f0c0003 */
(( android.view.MenuInflater ) v0 ).inflate ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V
/* .line 3 */
(( com.orange.hce.proto.activity.LogActivity ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/LogActivity;->a(Landroid/view/Menu;)V
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Boolean onOptionsItemSelected ( android.view.MenuItem p0 ) {
/* .locals 2 */
v0 = /* .line 1 */
/* const v1, 0x7f08012a */
/* if-eq v0, v1, :cond_0 */
/* packed-switch v0, :pswitch_data_0 */
/* .line 2 */
p1 = /* invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z */
/* :pswitch_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
(( com.orange.hce.proto.activity.LogActivity ) p0 ).e ( v0 ); // invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/LogActivity;->e(I)V
/* :pswitch_1 */
int v0 = 2; // const/4 v0, 0x2
/* .line 4 */
(( com.orange.hce.proto.activity.LogActivity ) p0 ).e ( v0 ); // invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/LogActivity;->e(I)V
/* :pswitch_2 */
int v0 = 1; // const/4 v0, 0x1
/* .line 5 */
(( com.orange.hce.proto.activity.LogActivity ) p0 ).e ( v0 ); // invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/LogActivity;->e(I)V
/* .line 6 */
} // :cond_0
v0 = this.w;
(( e.h.b.a.l.a1 ) v0 ).k ( ); // invoke-virtual {v0}, Le/h/b/a/l/a1;->k()V
/* .line 7 */
} // :goto_0
p1 = /* invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z */
/* :pswitch_data_0 */
/* .packed-switch 0x7f080007 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public void onPause ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0}, Lc/l/d/f0;->onPause()V */
/* .line 2 */
v0 = this.q;
int v1 = 0; // const/4 v1, 0x0
(( android.os.Handler ) v0 ).removeCallbacksAndMessages ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V
/* .line 3 */
c.p.a.d .a ( p0 );
v1 = this.r;
(( c.p.a.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V
/* .line 4 */
c.p.a.d .a ( p0 );
v1 = this.y;
(( c.p.a.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V
/* .line 5 */
/* new-instance v0, Lcom/orange/business/packid/android/lib/PackId; */
/* invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
(( com.orange.business.packid.android.lib.PackId ) v0 ).stopBroadcastRSSI ( ); // invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->stopBroadcastRSSI()V
/* .line 6 */
com.orange.oab.contactless.packid.debug.DebugConsole .resetLogScreenPrinter ( );
return;
} // .end method
public void onRequestPermissionsResult ( Integer p0, java.lang.String[] p1, Integer[] p2 ) {
/* .locals 0 */
/* .line 1 */
p2 = this.w;
(( e.h.b.a.l.a1 ) p2 ).a ( p1, p3 ); // invoke-virtual {p2, p1, p3}, Le/h/b/a/l/a1;->a(I[I)V
int p2 = 1; // const/4 p2, 0x1
/* if-ne p1, p2, :cond_0 */
/* .line 2 */
p1 = this.u;
(( com.orange.hce.proto.activity.LogActivity ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/LogActivity;->a(Landroid/view/Menu;)V
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
/* aget p1, p3, p1 */
/* if-nez p1, :cond_0 */
/* .line 4 */
(( com.orange.hce.proto.activity.LogActivity ) p0 ).A ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->A()V
} // :cond_0
return;
} // .end method
public void onResume ( ) {
/* .locals 4 */
/* .line 1 */
/* invoke-super {p0}, Lc/l/d/f0;->onResume()V */
/* .line 2 */
com.orange.oab.contactless.packid.debug.DebugConsole .initLogScreenPrinter ( p0 );
/* .line 3 */
/* new-instance v0, Lcom/orange/business/packid/android/lib/PackId; */
/* invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
(( com.orange.business.packid.android.lib.PackId ) v0 ).startBroadcastRSSI ( ); // invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->startBroadcastRSSI()V
/* .line 4 */
v0 = this.w;
(( e.h.b.a.l.a1 ) v0 ).h ( ); // invoke-virtual {v0}, Le/h/b/a/l/a1;->h()Ljava/lang/String;
/* .line 5 */
v1 = this.z;
v2 = android.widget.TextView$BufferType.SPANNABLE;
(( android.widget.TextView ) v1 ).setText ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
/* const v0, 0x7f08011a */
/* .line 6 */
(( c.b.k.r ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/ScrollView; */
(( com.orange.hce.proto.activity.LogActivity ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/LogActivity;->a(Landroid/widget/ScrollView;)Landroid/content/BroadcastReceiver;
this.r = v0;
/* .line 7 */
c.p.a.d .a ( p0 );
v1 = this.r;
/* new-instance v2, Landroid/content/IntentFilter; */
final String v3 = "LogService"; // const-string v3, "LogService"
/* invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( c.p.a.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
/* .line 8 */
c.p.a.d .a ( p0 );
v1 = this.y;
/* new-instance v2, Landroid/content/IntentFilter; */
final String v3 = "com.orange.oab.contactless.packid.action.RSSI"; // const-string v3, "com.orange.oab.contactless.packid.action.RSSI"
/* invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( c.p.a.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
/* .line 9 */
(( com.orange.hce.proto.activity.LogActivity ) p0 ).A ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->A()V
/* .line 10 */
(( com.orange.hce.proto.activity.LogActivity ) p0 ).y ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->y()V
/* const v0, 0x7f080110 */
/* .line 11 */
(( c.b.k.r ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/Switch; */
/* .line 12 */
/* new-instance v1, Lcom/orange/hce/proto/activity/LogActivity$a; */
/* invoke-direct {v1, p0}, Lcom/orange/hce/proto/activity/LogActivity$a;-><init>(Lcom/orange/hce/proto/activity/LogActivity;)V */
(( android.widget.Switch ) v0 ).setOnCheckedChangeListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
/* .line 13 */
v0 = this.A;
(( android.app.Activity ) p0 ).getApplication ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;
/* check-cast v1, Lcom/orange/hce/proto/PackIdApp; */
(( com.orange.hce.proto.PackIdApp ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/orange/hce/proto/PackIdApp;->a()Lcom/orange/business/packid/android/lib/PackId;
v1 = (( com.orange.business.packid.android.lib.PackId ) v1 ).isPersistentLogsActive ( ); // invoke-virtual {v1}, Lcom/orange/business/packid/android/lib/PackId;->isPersistentLogsActive()Z
(( android.widget.Switch ) v0 ).setChecked ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V
/* .line 14 */
v0 = this.A;
/* new-instance v1, Le/h/b/a/l/z; */
/* invoke-direct {v1, p0}, Le/h/b/a/l/z;-><init>(Lcom/orange/hce/proto/activity/LogActivity;)V */
(( android.widget.Switch ) v0 ).setOnCheckedChangeListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
return;
} // .end method
public final android.content.BroadcastReceiver s ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lcom/orange/hce/proto/activity/LogActivity$e; */
/* invoke-direct {v0, p0}, Lcom/orange/hce/proto/activity/LogActivity$e;-><init>(Lcom/orange/hce/proto/activity/LogActivity;)V */
} // .end method
public final java.lang.String t ( ) {
/* .locals 1 */
/* .line 1 */
(( android.app.Activity ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
} // .end method
public final java.lang.String u ( ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Lcom/orange/business/packid/android/lib/PackId; */
/* invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
(( com.orange.business.packid.android.lib.PackId ) v0 ).getContactlessIds ( ); // invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->getContactlessIds()Ljava/util/List;
/* .line 2 */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "[ "; // const-string v2, "[ "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
int v2 = 0; // const/4 v2, 0x0
/* .line 3 */
v3 = } // :goto_0
/* if-ge v2, v3, :cond_1 */
/* .line 4 */
/* check-cast v3, Ljava/lang/String; */
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = /* add-int/lit8 v2, v2, 0x1 */
/* if-ge v2, v3, :cond_0 */
final String v3 = ", "; // const-string v3, ", "
} // :cond_0
final String v3 = ""; // const-string v3, ""
} // :goto_1
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_1
final String v0 = " ]"; // const-string v0, " ]"
/* .line 5 */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 6 */
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public final java.lang.String v ( ) {
/* .locals 1 */
/* .line 1 */
(( android.app.Activity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
v0 = com.orange.business.packid.android.lib.PackIdUtility .isUWBAvaible ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "compatible"; // const-string v0, "compatible"
} // :cond_0
final String v0 = "not compatible"; // const-string v0, "not compatible"
} // .end method
public final void w ( ) {
/* .locals 13 */
/* .line 1 */
v0 = this.s;
(( android.view.ViewGroup ) v0 ).removeAllViews ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V
/* .line 2 */
/* new-instance v0, Lcom/orange/business/packid/android/lib/PackId; */
/* invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
(( com.orange.business.packid.android.lib.PackId ) v0 ).getUsers ( ); // invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->getUsers()Ljava/util/List;
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* check-cast v1, Lcom/orange/oab/contactless/packid/hce/user/User; */
/* .line 3 */
v2 = (( com.orange.oab.contactless.packid.hce.user.User ) v1 ).isSimCentric ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->isSimCentric()Z
/* if-nez v2, :cond_0 */
/* .line 4 */
(( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getWallet ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
(( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v2 ).getBadges ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;
} // :cond_1
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_0
/* check-cast v3, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
/* .line 5 */
v4 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v3 ).isNfcOnly ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isNfcOnly()Z
/* if-nez v4, :cond_1 */
/* .line 6 */
v4 = this.s;
/* new-instance v12, Le/h/b/a/l/e1; */
/* .line 7 */
(( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getContactlessId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
/* .line 8 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v3 ).getZoneId ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
/* .line 9 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v3 ).getDescription ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
/* .line 10 */
v10 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v3 ).getRssi ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getRssi()B
/* .line 11 */
v11 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v3 ).getRssiButtonInterval ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getRssiButtonInterval()B
/* move-object v5, v12 */
/* move-object v6, p0 */
/* invoke-direct/range {v5 ..v11}, Le/h/b/a/l/e1;-><init>(Landroid/content/Context;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;BB)V */
/* .line 12 */
(( android.view.ViewGroup ) v4 ).addView ( v12 ); // invoke-virtual {v4, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
/* .line 13 */
v4 = this.w;
(( e.h.b.a.l.a1 ) v4 ).f ( ); // invoke-virtual {v4}, Le/h/b/a/l/a1;->f()Ljava/lang/Boolean;
v4 = (( java.lang.Boolean ) v4 ).booleanValue ( ); // invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 14 */
v4 = this.w;
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "* contactlessId: "; // const-string v6, "* contactlessId: "
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getContactlessId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v6 ).toHexa ( ); // invoke-virtual {v6}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = " zone:"; // const-string v6, " zone:"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v3 ).getDescription ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = "("; // const-string v6, "("
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v3 ).getZoneId ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v6 ).toHexa ( ); // invoke-virtual {v6}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = ") rssi:"; // const-string v6, ") rssi:"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v3 ).getRssi ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getRssi()B
(( java.lang.StringBuilder ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.h.b.a.l.a1 ) v4 ).a ( v3 ); // invoke-virtual {v4, v3}, Le/h/b/a/l/a1;->a(Ljava/lang/String;)V
/* goto/16 :goto_0 */
} // :cond_2
return;
} // .end method
public final void x ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.w;
(( e.h.b.a.l.a1 ) v0 ).i ( ); // invoke-virtual {v0}, Le/h/b/a/l/a1;->i()V
/* .line 2 */
v0 = this.w;
(( e.h.b.a.l.a1 ) v0 ).e ( ); // invoke-virtual {v0}, Le/h/b/a/l/a1;->e()V
/* .line 3 */
v0 = this.z;
v1 = android.widget.TextView$BufferType.SPANNABLE;
final String v2 = ""; // const-string v2, ""
(( android.widget.TextView ) v0 ).setText ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
/* .line 4 */
(( com.orange.hce.proto.activity.LogActivity ) p0 ).A ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->A()V
/* .line 5 */
v0 = this.w;
(( e.h.b.a.l.a1 ) v0 ).h ( ); // invoke-virtual {v0}, Le/h/b/a/l/a1;->h()Ljava/lang/String;
/* .line 6 */
v1 = this.z;
v2 = android.widget.TextView$BufferType.SPANNABLE;
(( android.widget.TextView ) v1 ).setText ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
return;
} // .end method
public final void y ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.q;
/* new-instance v1, Lcom/orange/hce/proto/activity/LogActivity$c; */
/* const/16 v2, 0x3e8 */
/* invoke-direct {v1, p0, v2}, Lcom/orange/hce/proto/activity/LogActivity$c;-><init>(Lcom/orange/hce/proto/activity/LogActivity;I)V */
/* int-to-long v2, v2 */
(( android.os.Handler ) v0 ).postDelayed ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
return;
} // .end method
public final void z ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.t;
/* new-instance v1, Lcom/orange/hce/proto/activity/LogActivity$b; */
/* invoke-direct {v1, p0}, Lcom/orange/hce/proto/activity/LogActivity$b;-><init>(Lcom/orange/hce/proto/activity/LogActivity;)V */
(( android.view.View ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
return;
} // .end method

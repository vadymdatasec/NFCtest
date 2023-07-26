public class com.orange.hce.proto.activity.LegalInformationActivity extends c.b.k.r {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.Integer q;
	 public android.widget.TextView r;
	 public android.content.SharedPreferences s;
	 /* # direct methods */
	 public com.orange.hce.proto.activity.LegalInformationActivity ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/b/k/r;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 java.lang.Integer .valueOf ( v0 );
		 this.q = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.view.View p0 ) { //synthethic
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = this.q;
		 p1 = 		 (( java.lang.Integer ) p1 ).intValue ( ); // invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
		 /* add-int/lit8 p1, p1, 0x1 */
		 java.lang.Integer .valueOf ( p1 );
		 this.q = p1;
		 p1 = 		 (( java.lang.Integer ) p1 ).intValue ( ); // invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
		 int v0 = 7; // const/4 v0, 0x7
		 /* if-lt p1, v0, :cond_0 */
		 /* .line 2 */
		 (( com.orange.hce.proto.activity.LegalInformationActivity ) p0 ).x ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LegalInformationActivity;->x()V
	 } // :cond_0
	 return;
} // .end method
public Boolean b ( android.view.View p0 ) { //synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 (( com.orange.hce.proto.activity.LegalInformationActivity ) p0 ).x ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LegalInformationActivity;->x()V
	 int p1 = 1; // const/4 p1, 0x1
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* invoke-super {p0, p1}, Lc/b/k/r;->onCreate(Landroid/os/Bundle;)V */
	 /* const p1, 0x7f0b0020 */
	 /* .line 2 */
	 (( c.b.k.r ) p0 ).setContentView ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->setContentView(I)V
	 /* const p1, 0x7f08004a */
	 /* .line 3 */
	 (( c.b.k.r ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
	 /* check-cast p1, Landroid/widget/TextView; */
	 this.r = p1;
	 /* .line 4 */
	 (( android.app.Activity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
	 int v0 = 0; // const/4 v0, 0x0
	 final String v1 = "packid.app.preferences"; // const-string v1, "packid.app.preferences"
	 (( android.content.Context ) p1 ).getSharedPreferences ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
	 this.s = p1;
	 /* .line 5 */
	 (( com.orange.hce.proto.activity.LegalInformationActivity ) p0 ).w ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LegalInformationActivity;->w()V
	 /* .line 6 */
	 (( com.orange.hce.proto.activity.LegalInformationActivity ) p0 ).v ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LegalInformationActivity;->v()V
	 /* .line 7 */
	 (( com.orange.hce.proto.activity.LegalInformationActivity ) p0 ).u ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LegalInformationActivity;->u()V
	 /* .line 8 */
	 (( com.orange.hce.proto.activity.LegalInformationActivity ) p0 ).s ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LegalInformationActivity;->s()V
	 /* .line 9 */
	 java.lang.Integer .valueOf ( v0 );
	 this.q = p1;
	 return;
} // .end method
public final void s ( ) {
	 /* .locals 2 */
	 /* const v0, 0x7f080190 */
	 /* .line 1 */
	 (( c.b.k.r ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
	 /* check-cast v0, Landroidx/cardview/widget/CardView; */
	 /* .line 2 */
	 /* new-instance v1, Le/h/b/a/l/x; */
	 /* invoke-direct {v1, p0}, Le/h/b/a/l/x;-><init>(Lcom/orange/hce/proto/activity/LegalInformationActivity;)V */
	 (( android.widget.FrameLayout ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
	 /* .line 3 */
	 /* new-instance v1, Le/h/b/a/l/w; */
	 /* invoke-direct {v1, p0}, Le/h/b/a/l/w;-><init>(Lcom/orange/hce/proto/activity/LegalInformationActivity;)V */
	 (( android.widget.FrameLayout ) v0 ).setOnLongClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
	 return;
} // .end method
public final java.lang.String t ( ) {
	 /* .locals 4 */
	 /* .line 1 */
	 try { // :try_start_0
		 (( android.app.Activity ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;
		 (( android.app.Activity ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
		 int v2 = 0; // const/4 v2, 0x0
		 (( android.content.pm.PackageManager ) v0 ).getPackageInfo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
		 v0 = this.versionName;
		 /* const v1, 0x7f0e002d */
		 int v3 = 1; // const/4 v3, 0x1
		 /* new-array v3, v3, [Ljava/lang/Object; */
		 /* aput-object v0, v3, v2 */
		 /* .line 2 */
		 (( android.app.Activity ) p0 ).getString ( v1, v3 ); // invoke-virtual {p0, v1, v3}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
		 /* :try_end_0 */
		 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* const v0, 0x7f0e002e */
		 /* .line 3 */
		 (( android.app.Activity ) p0 ).getString ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;
	 } // .end method
	 public final void u ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.s;
		 final String v1 = "DEVELOPER_MODE"; // const-string v1, "DEVELOPER_MODE"
		 v0 = 		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 2 */
		 v1 = this.r;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* const v0, 0x7f0e002c */
		 } // :cond_0
		 /* const v0, 0x7f0e002b */
	 } // :goto_0
	 (( android.widget.TextView ) v1 ).setText ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V
	 return;
} // .end method
public final void v ( ) {
	 /* .locals 2 */
	 /* const v0, 0x7f08004b */
	 /* .line 1 */
	 (( c.b.k.r ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
	 /* check-cast v0, Landroid/widget/TextView; */
	 /* .line 2 */
	 (( com.orange.hce.proto.activity.LegalInformationActivity ) p0 ).t ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LegalInformationActivity;->t()Ljava/lang/String;
	 (( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
	 return;
} // .end method
public final void w ( ) {
	 /* .locals 2 */
	 /* const v0, 0x7f08016b */
	 /* .line 1 */
	 (( c.b.k.r ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
	 /* check-cast v0, Landroidx/appcompat/widget/Toolbar; */
	 (( c.b.k.r ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/r;->a(Landroidx/appcompat/widget/Toolbar;)V
	 /* .line 2 */
	 (( c.b.k.r ) p0 ).p ( ); // invoke-virtual {p0}, Lc/b/k/r;->p()Lc/b/k/a;
	 int v1 = 1; // const/4 v1, 0x1
	 (( c.b.k.a ) v0 ).d ( v1 ); // invoke-virtual {v0, v1}, Lc/b/k/a;->d(Z)V
	 return;
} // .end method
public final void x ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* new-instance v0, Landroid/content/Intent; */
	 /* const-class v1, Lcom/orange/hce/proto/activity/LogActivity; */
	 /* invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
	 (( android.app.Activity ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
	 return;
} // .end method

public class com.orange.hce.proto.activity.SplashScreenActivity extends android.app.Activity {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public com.orange.hce.proto.activity.SplashScreenActivity ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final java.lang.String a ( ) {
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
		 public final android.content.Intent b ( ) {
			 /* .locals 3 */
			 /* .line 1 */
			 (( com.orange.hce.proto.activity.SplashScreenActivity ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/SplashScreenActivity;->c()Landroid/net/Uri;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 2 */
				 /* new-instance v1, Landroid/content/Intent; */
				 /* const-class v2, Lcom/orange/hce/proto/activity/BadgeListActivity; */
				 /* invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
				 /* .line 3 */
				 (( android.content.Intent ) v1 ).setData ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
				 /* .line 4 */
			 } // :cond_0
			 /* new-instance v0, Lcom/orange/business/packid/android/lib/PackId; */
			 /* invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
			 v0 = 			 (( com.orange.business.packid.android.lib.PackId ) v0 ).getUsers ( ); // invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->getUsers()Ljava/util/List;
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 5 */
				 /* new-instance v0, Landroid/content/Intent; */
				 /* const-class v1, Lcom/orange/hce/proto/activity/NoBadgeActivity; */
				 /* invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
				 /* .line 6 */
			 } // :cond_1
			 /* new-instance v0, Landroid/content/Intent; */
			 /* const-class v1, Lcom/orange/hce/proto/activity/BadgeListActivity; */
			 /* invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
		 } // .end method
		 public final android.net.Uri c ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 (( android.app.Activity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
			 /* if-nez v0, :cond_0 */
			 int v0 = 0; // const/4 v0, 0x0
		 } // :cond_0
		 (( android.app.Activity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
		 (( android.content.Intent ) v0 ).getData ( ); // invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;
	 } // :goto_0
} // .end method
public void d ( ) { //synthethic
	 /* .locals 2 */
	 final String v0 = "packid.SplashScreen"; // const-string v0, "packid.SplashScreen"
	 final String v1 = "start next activity"; // const-string v1, "start next activity"
	 /* .line 1 */
	 android.util.Log .d ( v0,v1 );
	 /* .line 2 */
	 (( com.orange.hce.proto.activity.SplashScreenActivity ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/SplashScreenActivity;->b()Landroid/content/Intent;
	 (( android.app.Activity ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
	 /* .line 3 */
	 (( android.app.Activity ) p0 ).finish ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finish()V
	 return;
} // .end method
public final void e ( ) {
	 /* .locals 4 */
	 /* .line 1 */
	 /* new-instance v0, Landroid/os/Handler; */
	 android.os.Looper .getMainLooper ( );
	 /* invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
	 /* new-instance v1, Le/h/b/a/l/q0; */
	 /* invoke-direct {v1, p0}, Le/h/b/a/l/q0;-><init>(Lcom/orange/hce/proto/activity/SplashScreenActivity;)V */
	 /* const-wide/16 v2, 0xbb8 */
	 (( android.os.Handler ) v0 ).postDelayed ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
	 return;
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
	 /* .locals 3 */
	 /* .line 1 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v1 = "onCreate "; // const-string v1, "onCreate "
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( android.app.Activity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 final String v1 = "packid.SplashScreen"; // const-string v1, "packid.SplashScreen"
	 android.util.Log .d ( v1,v0 );
	 /* .line 2 */
	 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
	 /* const p1, 0x7f0b0024 */
	 /* .line 3 */
	 (( android.app.Activity ) p0 ).setContentView ( p1 ); // invoke-virtual {p0, p1}, Landroid/app/Activity;->setContentView(I)V
	 /* const p1, 0x7f08004b */
	 /* .line 4 */
	 (( android.app.Activity ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;
	 /* check-cast p1, Landroid/widget/TextView; */
	 (( com.orange.hce.proto.activity.SplashScreenActivity ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/SplashScreenActivity;->a()Ljava/lang/String;
	 (( android.widget.TextView ) p1 ).setText ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
	 /* .line 5 */
	 p1 = 	 (( android.app.Activity ) p0 ).isTaskRoot ( ); // invoke-virtual {p0}, Landroid/app/Activity;->isTaskRoot()Z
	 /* if-nez p1, :cond_0 */
	 (( com.orange.hce.proto.activity.SplashScreenActivity ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/SplashScreenActivity;->c()Landroid/net/Uri;
	 /* if-nez p1, :cond_0 */
	 /* .line 6 */
	 (( android.app.Activity ) p0 ).finish ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finish()V
	 return;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
final String v0 = "SplashScreenActivity"; // const-string v0, "SplashScreenActivity"
/* .line 7 */
(( android.app.Activity ) p0 ).getSharedPreferences ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
int v1 = 1; // const/4 v1, 0x1
final String v2 = "firstrun"; // const-string v2, "firstrun"
v1 = /* .line 8 */
/* if-nez v1, :cond_1 */
/* .line 9 */
(( com.orange.hce.proto.activity.SplashScreenActivity ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/SplashScreenActivity;->b()Landroid/content/Intent;
(( android.app.Activity ) p0 ).startActivity ( p1 ); // invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
/* .line 10 */
(( android.app.Activity ) p0 ).finish ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finish()V
return;
/* .line 11 */
} // :cond_1
/* .line 12 */
(( com.orange.hce.proto.activity.SplashScreenActivity ) p0 ).e ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/SplashScreenActivity;->e()V
return;
} // .end method
public void onNewIntent ( android.content.Intent p0 ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "onNewIntent "; // const-string v1, "onNewIntent "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid.SplashScreen"; // const-string v1, "packid.SplashScreen"
android.util.Log .d ( v1,v0 );
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V */
/* .line 3 */
(( android.app.Activity ) p0 ).setIntent ( p1 ); // invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V
return;
} // .end method

public class com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity extends android.app.Activity implements android.content.DialogInterface$OnClickListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final java.lang.String a ( ) {
		 /* .locals 2 */
		 (( android.app.Activity ) p0 ).getApplicationInfo ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
		 (( android.app.Activity ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;
		 (( android.content.pm.ApplicationInfo ) v0 ).loadLabel ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
	 } // .end method
	 public final void a ( java.lang.String p0 ) {
		 /* .locals 4 */
		 java.lang.String .valueOf ( p1 );
		 v0 = 		 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* add-int/lit8 v0, v0, 0x42 */
		 /* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V */
		 final String v0 = "market://details?id="; // const-string v0, "market://details?id="
		 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v0 = "&referrer=utm_source%3Dplay.core.missingsplits"; // const-string v0, "&referrer=utm_source%3Dplay.core.missingsplits"
		 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* new-instance v1, Landroid/content/Intent; */
		 final String v2 = "android.intent.action.VIEW"; // const-string v2, "android.intent.action.VIEW"
		 /* invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
		 android.net.Uri .parse ( v0 );
		 (( android.content.Intent ) v1 ).setData ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
		 final String v1 = "com.android.vending"; // const-string v1, "com.android.vending"
		 (( android.content.Intent ) v0 ).setPackage ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
		 try { // :try_start_0
			 (( android.app.Activity ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
			 /* :try_end_0 */
			 /* .catch Landroid/content/ActivityNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
			 return;
			 /* :catch_0 */
			 /* move-exception v0 */
			 /* new-instance v1, Le/f/a/d/a/e/a; */
			 /* const-class v2, Lcom/google/android/play/core/missingsplits/PlayCoreMissingSplitsActivity; */
			 (( java.lang.Class ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
			 /* invoke-direct {v1, v2}, Le/f/a/d/a/e/a;-><init>(Ljava/lang/String;)V */
			 int v2 = 1; // const/4 v2, 0x1
			 /* new-array v2, v2, [Ljava/lang/Object; */
			 int v3 = 0; // const/4 v3, 0x0
			 /* aput-object p1, v2, v3 */
			 final String p1 = "Couldn\'t start missing splits activity for %s"; // const-string p1, "Couldn\'t start missing splits activity for %s"
			 (( e.f.a.d.a.e.a ) v1 ).a ( v0, p1, v2 ); // invoke-virtual {v1, v0, p1, v2}, Le/f/a/d/a/e/a;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
			 return;
		 } // .end method
		 public final void onClick ( android.content.DialogInterface p0, Integer p1 ) {
			 /* .locals 0 */
			 int p1 = -1; // const/4 p1, -0x1
			 /* if-eq p2, p1, :cond_0 */
		 } // :cond_0
		 (( android.app.Activity ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
		 (( com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/play/core/missingsplits/PlayCoreMissingSplitsActivity;->a(Ljava/lang/String;)V
	 } // :goto_0
	 (( android.app.Activity ) p0 ).finish ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finish()V
	 return;
} // .end method
public final void onCreate ( android.os.Bundle p0 ) {
	 /* .locals 4 */
	 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
	 /* new-instance p1, Landroid/app/AlertDialog$Builder; */
	 /* invoke-direct {p1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
	 final String v0 = "Installation failed"; // const-string v0, "Installation failed"
	 (( android.app.AlertDialog$Builder ) p1 ).setTitle ( v0 ); // invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
	 int v0 = 0; // const/4 v0, 0x0
	 (( android.app.AlertDialog$Builder ) p1 ).setCancelable ( v0 ); // invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
	 final String v0 = "Close"; // const-string v0, "Close"
	 (( android.app.AlertDialog$Builder ) p1 ).setNeutralButton ( v0, p0 ); // invoke-virtual {p1, v0, p0}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
	 v0 = 	 e.f.a.d.a.e.n .a ( p0 );
	 final String v1 = "The app "; // const-string v1, "The app "
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 (( com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/google/android/play/core/missingsplits/PlayCoreMissingSplitsActivity;->a()Ljava/lang/String;
		 java.lang.String .valueOf ( v0 );
		 v2 = 		 (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
		 /* new-instance v3, Ljava/lang/StringBuilder; */
		 /* add-int/lit8 v2, v2, 0x5b */
		 /* invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V */
		 (( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v0 = " is missing required components and must be reinstalled from the Google Play Store."; // const-string v0, " is missing required components and must be reinstalled from the Google Play Store."
		 (( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 (( android.app.AlertDialog$Builder ) p1 ).setMessage ( v0 ); // invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
		 final String v1 = "Reinstall"; // const-string v1, "Reinstall"
		 (( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
	 } // :cond_0
	 (( com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/google/android/play/core/missingsplits/PlayCoreMissingSplitsActivity;->a()Ljava/lang/String;
	 java.lang.String .valueOf ( v0 );
	 v2 = 	 (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 /* add-int/lit8 v2, v2, 0x57 */
	 /* invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V */
	 (( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v0 = " is missing required components and must be reinstalled from an official store."; // const-string v0, " is missing required components and must be reinstalled from an official store."
	 (( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( android.app.AlertDialog$Builder ) p1 ).setMessage ( v0 ); // invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
} // :goto_0
(( android.app.AlertDialog$Builder ) p1 ).create ( ); // invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
(( android.app.AlertDialog ) p1 ).show ( ); // invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V
return;
} // .end method

public abstract class c.h.e.r {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static android.content.Intent a ( android.app.Activity p0 ) {
		 /* .locals 3 */
		 /* .line 6 */
		 /* const/16 v1, 0x10 */
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 7 */
		 (( android.app.Activity ) p0 ).getParentActivityIntent ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getParentActivityIntent()Landroid/content/Intent;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 8 */
		 } // :cond_0
		 c.h.e.r .b ( p0 );
		 int v1 = 0; // const/4 v1, 0x0
		 /* if-nez v0, :cond_1 */
		 /* .line 9 */
	 } // :cond_1
	 /* new-instance v2, Landroid/content/ComponentName; */
	 /* invoke-direct {v2, p0, v0}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V */
	 /* .line 10 */
	 try { // :try_start_0
		 c.h.e.r .b ( p0,v2 );
		 /* if-nez p0, :cond_2 */
		 /* .line 11 */
		 android.content.Intent .makeMainActivity ( v2 );
		 /* .line 12 */
	 } // :cond_2
	 /* new-instance p0, Landroid/content/Intent; */
	 /* invoke-direct {p0}, Landroid/content/Intent;-><init>()V */
	 (( android.content.Intent ) p0 ).setComponent ( v2 ); // invoke-virtual {p0, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
	 /* :try_end_0 */
	 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
/* .line 13 */
/* :catch_0 */
/* new-instance p0, Ljava/lang/StringBuilder; */
/* invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "getParentActivityIntent: bad parentActivityName \'"; // const-string v2, "getParentActivityIntent: bad parentActivityName \'"
(( java.lang.StringBuilder ) p0 ).append ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p0 ).append ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "\' in manifest"; // const-string v0, "\' in manifest"
(( java.lang.StringBuilder ) p0 ).append ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "NavUtils"; // const-string v0, "NavUtils"
android.util.Log .e ( v0,p0 );
} // .end method
public static android.content.Intent a ( android.content.Context p0, android.content.ComponentName p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/content/pm/PackageManager$NameNotFoundException; */
/* } */
} // .end annotation
/* .line 14 */
c.h.e.r .b ( p0,p1 );
/* if-nez v0, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 15 */
} // :cond_0
/* new-instance v1, Landroid/content/ComponentName; */
/* .line 16 */
(( android.content.ComponentName ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
/* invoke-direct {v1, p1, v0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 17 */
c.h.e.r .b ( p0,v1 );
/* if-nez p0, :cond_1 */
/* .line 18 */
android.content.Intent .makeMainActivity ( v1 );
/* .line 19 */
} // :cond_1
/* new-instance p0, Landroid/content/Intent; */
/* invoke-direct {p0}, Landroid/content/Intent;-><init>()V */
(( android.content.Intent ) p0 ).setComponent ( v1 ); // invoke-virtual {p0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
} // :goto_0
} // .end method
public static void a ( android.app.Activity p0, android.content.Intent p1 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
(( android.app.Activity ) p0 ).navigateUpTo ( p1 ); // invoke-virtual {p0, p1}, Landroid/app/Activity;->navigateUpTo(Landroid/content/Intent;)Z
} // :cond_0
/* const/high16 v0, 0x4000000 */
/* .line 3 */
(( android.content.Intent ) p1 ).addFlags ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
/* .line 4 */
(( android.app.Activity ) p0 ).startActivity ( p1 ); // invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
/* .line 5 */
(( android.app.Activity ) p0 ).finish ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finish()V
} // :goto_0
return;
} // .end method
public static java.lang.String b ( android.app.Activity p0 ) {
/* .locals 1 */
/* .line 5 */
try { // :try_start_0
(( android.app.Activity ) p0 ).getComponentName ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;
c.h.e.r .b ( p0,v0 );
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
/* .line 6 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V */
/* throw v0 */
} // .end method
public static java.lang.String b ( android.content.Context p0, android.content.ComponentName p1 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/content/pm/PackageManager$NameNotFoundException; */
/* } */
} // .end annotation
/* .line 7 */
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 8 */
/* const/16 v2, 0x18 */
/* const/16 v1, 0x280 */
/* .line 9 */
/* const/16 v4, 0x1d */
/* if-lt v3, v4, :cond_0 */
/* const v1, 0x100c0280 */
} // :cond_0
/* if-lt v3, v2, :cond_1 */
/* const v1, 0xc0280 */
/* .line 10 */
} // :cond_1
} // :goto_0
(( android.content.pm.PackageManager ) v0 ).getActivityInfo ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
/* .line 11 */
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_2 */
/* .line 12 */
v0 = this.parentActivityName;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 13 */
} // :cond_2
p1 = this.metaData;
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_3 */
} // :cond_3
final String v1 = "android.support.PARENT_ACTIVITY"; // const-string v1, "android.support.PARENT_ACTIVITY"
/* .line 14 */
(( android.os.Bundle ) p1 ).getString ( v1 ); // invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* if-nez p1, :cond_4 */
} // :cond_4
int v0 = 0; // const/4 v0, 0x0
/* .line 15 */
v0 = (( java.lang.String ) p1 ).charAt ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C
/* const/16 v1, 0x2e */
/* if-ne v0, v1, :cond_5 */
/* .line 16 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_5
} // .end method
public static Boolean b ( android.app.Activity p0, android.content.Intent p1 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = (( android.app.Activity ) p0 ).shouldUpRecreateTask ( p1 ); // invoke-virtual {p0, p1}, Landroid/app/Activity;->shouldUpRecreateTask(Landroid/content/Intent;)Z
/* .line 3 */
} // :cond_0
(( android.app.Activity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) p0 ).getAction ( ); // invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;
if ( p0 != null) { // if-eqz p0, :cond_1
final String p1 = "android.intent.action.MAIN"; // const-string p1, "android.intent.action.MAIN"
/* .line 4 */
p0 = (( java.lang.String ) p0 ).equals ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez p0, :cond_1 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method

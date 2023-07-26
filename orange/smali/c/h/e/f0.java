public abstract class c.h.e.f0 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.Object a;
	 public static java.lang.reflect.Field b;
	 public static Boolean c;
	 /* # direct methods */
	 public static c.h.e.f0 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/Object; */
		 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static android.os.Bundle a ( android.app.Notification$Builder p0, Object p1 ) {
		 /* .locals 3 */
		 /* .line 25 */
		 (( c.h.e.t ) p1 ).e ( ); // invoke-virtual {p1}, Lc/h/e/t;->e()Landroidx/core/graphics/drawable/IconCompat;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 26 */
			 v0 = 			 (( androidx.core.graphics.drawable.IconCompat ) v0 ).b ( ); // invoke-virtual {v0}, Landroidx/core/graphics/drawable/IconCompat;->b()I
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 27 */
	 } // :goto_0
	 (( c.h.e.t ) p1 ).i ( ); // invoke-virtual {p1}, Lc/h/e/t;->i()Ljava/lang/CharSequence;
	 /* .line 28 */
	 (( c.h.e.t ) p1 ).a ( ); // invoke-virtual {p1}, Lc/h/e/t;->a()Landroid/app/PendingIntent;
	 /* .line 29 */
	 (( android.app.Notification$Builder ) p0 ).addAction ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Landroid/app/Notification$Builder;->addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;
	 /* .line 30 */
	 /* new-instance p0, Landroid/os/Bundle; */
	 (( c.h.e.t ) p1 ).d ( ); // invoke-virtual {p1}, Lc/h/e/t;->d()Landroid/os/Bundle;
	 /* invoke-direct {p0, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V */
	 /* .line 31 */
	 (( c.h.e.t ) p1 ).f ( ); // invoke-virtual {p1}, Lc/h/e/t;->f()[Lc/h/e/h0;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 32 */
		 (( c.h.e.t ) p1 ).f ( ); // invoke-virtual {p1}, Lc/h/e/t;->f()[Lc/h/e/h0;
		 c.h.e.f0 .a ( v0 );
		 final String v1 = "android.support.remoteInputs"; // const-string v1, "android.support.remoteInputs"
		 /* .line 33 */
		 (( android.os.Bundle ) p0 ).putParcelableArray ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V
		 /* .line 34 */
	 } // :cond_1
	 (( c.h.e.t ) p1 ).c ( ); // invoke-virtual {p1}, Lc/h/e/t;->c()[Lc/h/e/h0;
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 35 */
		 (( c.h.e.t ) p1 ).c ( ); // invoke-virtual {p1}, Lc/h/e/t;->c()[Lc/h/e/h0;
		 c.h.e.f0 .a ( v0 );
		 final String v1 = "android.support.dataRemoteInputs"; // const-string v1, "android.support.dataRemoteInputs"
		 /* .line 36 */
		 (( android.os.Bundle ) p0 ).putParcelableArray ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V
		 /* .line 37 */
	 } // :cond_2
	 p1 = 	 (( c.h.e.t ) p1 ).b ( ); // invoke-virtual {p1}, Lc/h/e/t;->b()Z
	 final String v0 = "android.support.allowGeneratedReplies"; // const-string v0, "android.support.allowGeneratedReplies"
	 /* .line 38 */
	 (( android.os.Bundle ) p0 ).putBoolean ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
} // .end method
public static android.os.Bundle a ( android.app.Notification p0 ) {
	 /* .locals 6 */
	 /* .line 5 */
	 v0 = c.h.e.f0.a;
	 /* monitor-enter v0 */
	 /* .line 6 */
	 try { // :try_start_0
		 /* sget-boolean v1, Lc/h/e/f0;->c:Z */
		 int v2 = 0; // const/4 v2, 0x0
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 7 */
			 /* monitor-exit v0 */
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 } // :cond_0
		 int v1 = 1; // const/4 v1, 0x1
		 /* .line 8 */
		 try { // :try_start_1
			 v3 = c.h.e.f0.b;
			 /* if-nez v3, :cond_2 */
			 /* .line 9 */
			 /* const-class v3, Landroid/app/Notification; */
			 final String v4 = "extras"; // const-string v4, "extras"
			 (( java.lang.Class ) v3 ).getDeclaredField ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
			 /* .line 10 */
			 /* const-class v4, Landroid/os/Bundle; */
			 (( java.lang.reflect.Field ) v3 ).getType ( ); // invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
			 v4 = 			 (( java.lang.Class ) v4 ).isAssignableFrom ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
			 /* if-nez v4, :cond_1 */
			 final String p0 = "NotificationCompat"; // const-string p0, "NotificationCompat"
			 final String v3 = "Notification.extras field is not of type Bundle"; // const-string v3, "Notification.extras field is not of type Bundle"
			 /* .line 11 */
			 android.util.Log .e ( p0,v3 );
			 /* .line 12 */
			 c.h.e.f0.c = (v1!= 0);
			 /* :try_end_1 */
			 /* .catch Ljava/lang/IllegalAccessException; {:try_start_1 ..:try_end_1} :catch_1 */
			 /* .catch Ljava/lang/NoSuchFieldException; {:try_start_1 ..:try_end_1} :catch_0 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 /* .line 13 */
			 try { // :try_start_2
				 /* monitor-exit v0 */
				 /* :try_end_2 */
				 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
				 /* .line 14 */
			 } // :cond_1
			 try { // :try_start_3
				 (( java.lang.reflect.Field ) v3 ).setAccessible ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
				 /* .line 15 */
				 /* .line 16 */
			 } // :cond_2
			 v3 = c.h.e.f0.b;
			 (( java.lang.reflect.Field ) v3 ).get ( p0 ); // invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v3, Landroid/os/Bundle; */
			 /* if-nez v3, :cond_3 */
			 /* .line 17 */
			 /* new-instance v3, Landroid/os/Bundle; */
			 /* invoke-direct {v3}, Landroid/os/Bundle;-><init>()V */
			 /* .line 18 */
			 v4 = c.h.e.f0.b;
			 (( java.lang.reflect.Field ) v4 ).set ( p0, v3 ); // invoke-virtual {v4, p0, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
			 /* :try_end_3 */
			 /* .catch Ljava/lang/IllegalAccessException; {:try_start_3 ..:try_end_3} :catch_1 */
			 /* .catch Ljava/lang/NoSuchFieldException; {:try_start_3 ..:try_end_3} :catch_0 */
			 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
			 /* .line 19 */
		 } // :cond_3
		 try { // :try_start_4
			 /* monitor-exit v0 */
			 /* :catch_0 */
			 /* move-exception p0 */
			 final String v3 = "NotificationCompat"; // const-string v3, "NotificationCompat"
			 final String v4 = "Unable to access notification extras"; // const-string v4, "Unable to access notification extras"
			 /* .line 20 */
			 android.util.Log .e ( v3,v4,p0 );
			 /* :catch_1 */
			 /* move-exception p0 */
			 final String v3 = "NotificationCompat"; // const-string v3, "NotificationCompat"
			 final String v4 = "Unable to access notification extras"; // const-string v4, "Unable to access notification extras"
			 /* .line 21 */
			 android.util.Log .e ( v3,v4,p0 );
			 /* .line 22 */
		 } // :goto_0
		 c.h.e.f0.c = (v1!= 0);
		 /* .line 23 */
		 /* monitor-exit v0 */
		 /* :catchall_0 */
		 /* move-exception p0 */
		 /* .line 24 */
		 /* monitor-exit v0 */
		 /* :try_end_4 */
		 /* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
		 /* throw p0 */
	 } // .end method
	 public static android.os.Bundle a ( c.h.e.h0 p0 ) {
		 /* .locals 3 */
		 /* .line 53 */
		 /* new-instance v0, Landroid/os/Bundle; */
		 /* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
		 /* .line 54 */
		 (( c.h.e.h0 ) p0 ).g ( ); // invoke-virtual {p0}, Lc/h/e/h0;->g()Ljava/lang/String;
		 final String v2 = "resultKey"; // const-string v2, "resultKey"
		 (( android.os.Bundle ) v0 ).putString ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 55 */
		 (( c.h.e.h0 ) p0 ).f ( ); // invoke-virtual {p0}, Lc/h/e/h0;->f()Ljava/lang/CharSequence;
		 final String v2 = "label"; // const-string v2, "label"
		 (( android.os.Bundle ) v0 ).putCharSequence ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V
		 /* .line 56 */
		 (( c.h.e.h0 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/e/h0;->c()[Ljava/lang/CharSequence;
		 final String v2 = "choices"; // const-string v2, "choices"
		 (( android.os.Bundle ) v0 ).putCharSequenceArray ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putCharSequenceArray(Ljava/lang/String;[Ljava/lang/CharSequence;)V
		 /* .line 57 */
		 v1 = 		 (( c.h.e.h0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/h/e/h0;->a()Z
		 final String v2 = "allowFreeFormInput"; // const-string v2, "allowFreeFormInput"
		 (( android.os.Bundle ) v0 ).putBoolean ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
		 /* .line 58 */
		 (( c.h.e.h0 ) p0 ).e ( ); // invoke-virtual {p0}, Lc/h/e/h0;->e()Landroid/os/Bundle;
		 final String v2 = "extras"; // const-string v2, "extras"
		 (( android.os.Bundle ) v0 ).putBundle ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
		 /* .line 59 */
		 (( c.h.e.h0 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/h/e/h0;->b()Ljava/util/Set;
		 if ( p0 != null) { // if-eqz p0, :cond_1
			 v1 = 			 /* .line 60 */
			 /* if-nez v1, :cond_1 */
			 /* .line 61 */
			 v2 = 			 /* new-instance v1, Ljava/util/ArrayList; */
			 /* invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V */
			 /* .line 62 */
		 v2 = 		 } // :goto_0
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* check-cast v2, Ljava/lang/String; */
			 /* .line 63 */
			 (( java.util.ArrayList ) v1 ).add ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
		 } // :cond_0
		 final String p0 = "allowedDataTypes"; // const-string p0, "allowedDataTypes"
		 /* .line 64 */
		 (( android.os.Bundle ) v0 ).putStringArrayList ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
	 } // :cond_1
} // .end method
public static android.os.Bundle a ( Object p0 ) {
	 /* .locals 4 */
	 /* .line 39 */
	 /* new-instance v0, Landroid/os/Bundle; */
	 /* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
	 /* .line 40 */
	 (( c.h.e.t ) p0 ).e ( ); // invoke-virtual {p0}, Lc/h/e/t;->e()Landroidx/core/graphics/drawable/IconCompat;
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 41 */
		 v1 = 		 (( androidx.core.graphics.drawable.IconCompat ) v1 ).b ( ); // invoke-virtual {v1}, Landroidx/core/graphics/drawable/IconCompat;->b()I
	 } // :cond_0
	 int v1 = 0; // const/4 v1, 0x0
} // :goto_0
final String v2 = "icon"; // const-string v2, "icon"
(( android.os.Bundle ) v0 ).putInt ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
/* .line 42 */
(( c.h.e.t ) p0 ).i ( ); // invoke-virtual {p0}, Lc/h/e/t;->i()Ljava/lang/CharSequence;
final String v2 = "title"; // const-string v2, "title"
(( android.os.Bundle ) v0 ).putCharSequence ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V
/* .line 43 */
(( c.h.e.t ) p0 ).a ( ); // invoke-virtual {p0}, Lc/h/e/t;->a()Landroid/app/PendingIntent;
final String v2 = "actionIntent"; // const-string v2, "actionIntent"
(( android.os.Bundle ) v0 ).putParcelable ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
/* .line 44 */
(( c.h.e.t ) p0 ).d ( ); // invoke-virtual {p0}, Lc/h/e/t;->d()Landroid/os/Bundle;
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* .line 45 */
	 /* new-instance v1, Landroid/os/Bundle; */
	 (( c.h.e.t ) p0 ).d ( ); // invoke-virtual {p0}, Lc/h/e/t;->d()Landroid/os/Bundle;
	 /* invoke-direct {v1, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V */
	 /* .line 46 */
} // :cond_1
/* new-instance v1, Landroid/os/Bundle; */
/* invoke-direct {v1}, Landroid/os/Bundle;-><init>()V */
/* .line 47 */
} // :goto_1
v2 = (( c.h.e.t ) p0 ).b ( ); // invoke-virtual {p0}, Lc/h/e/t;->b()Z
final String v3 = "android.support.allowGeneratedReplies"; // const-string v3, "android.support.allowGeneratedReplies"
/* .line 48 */
(( android.os.Bundle ) v1 ).putBoolean ( v3, v2 ); // invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
final String v2 = "extras"; // const-string v2, "extras"
/* .line 49 */
(( android.os.Bundle ) v0 ).putBundle ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
/* .line 50 */
(( c.h.e.t ) p0 ).f ( ); // invoke-virtual {p0}, Lc/h/e/t;->f()[Lc/h/e/h0;
c.h.e.f0 .a ( v1 );
final String v2 = "remoteInputs"; // const-string v2, "remoteInputs"
(( android.os.Bundle ) v0 ).putParcelableArray ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V
/* .line 51 */
v1 = (( c.h.e.t ) p0 ).h ( ); // invoke-virtual {p0}, Lc/h/e/t;->h()Z
final String v2 = "showsUserInterface"; // const-string v2, "showsUserInterface"
(( android.os.Bundle ) v0 ).putBoolean ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
/* .line 52 */
p0 = (( c.h.e.t ) p0 ).g ( ); // invoke-virtual {p0}, Lc/h/e/t;->g()I
final String v1 = "semanticAction"; // const-string v1, "semanticAction"
(( android.os.Bundle ) v0 ).putInt ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
} // .end method
public static android.util.SparseArray a ( java.util.List p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Landroid/os/Bundle;", */
/* ">;)", */
/* "Landroid/util/SparseArray<", */
/* "Landroid/os/Bundle;", */
/* ">;" */
/* } */
} // .end annotation
v0 = /* .line 1 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_2 */
/* .line 2 */
/* check-cast v3, Landroid/os/Bundle; */
if ( v3 != null) { // if-eqz v3, :cond_1
/* if-nez v1, :cond_0 */
/* .line 3 */
/* new-instance v1, Landroid/util/SparseArray; */
/* invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V */
/* .line 4 */
} // :cond_0
(( android.util.SparseArray ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
} // .end method
public static android.os.Bundle a ( c.h.e.h0[] p0 ) {
/* .locals 3 */
/* if-nez p0, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 65 */
} // :cond_0
/* array-length v0, p0 */
/* new-array v0, v0, [Landroid/os/Bundle; */
int v1 = 0; // const/4 v1, 0x0
/* .line 66 */
} // :goto_0
/* array-length v2, p0 */
/* if-ge v1, v2, :cond_1 */
/* .line 67 */
/* aget-object v2, p0, v1 */
c.h.e.f0 .a ( v2 );
/* aput-object v2, v0, v1 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
} // .end method

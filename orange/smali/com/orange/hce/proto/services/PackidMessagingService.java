public class com.orange.hce.proto.services.PackidMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.content.SharedPreferences h;
	 /* # direct methods */
	 public static com.orange.hce.proto.services.PackidMessagingService ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* const-class v0, Lcom/orange/hce/proto/services/PackidMessagingService; */
		 return;
	 } // .end method
	 public com.orange.hce.proto.services.PackidMessagingService ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessagingService;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( e.f.c.u.b0 p0 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 /* invoke-super {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->a(Le/f/c/u/b0;)V */
		 /* .line 2 */
		 (( e.f.c.u.b0 ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/u/b0;->a()Ljava/util/Map;
		 final String v1 = "update"; // const-string v1, "update"
		 final String v2 = "FirebaseService"; // const-string v2, "FirebaseService"
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 3 */
			 (( e.f.c.u.b0 ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/u/b0;->a()Ljava/util/Map;
			 /* check-cast p1, Ljava/lang/String; */
			 final String v0 = "true"; // const-string v0, "true"
			 /* .line 4 */
			 p1 = 			 (( java.lang.String ) p1 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
			 if ( p1 != null) { // if-eqz p1, :cond_3
				 final String p1 = "Update user triggered by Pack Id server"; // const-string p1, "Update user triggered by Pack Id server"
				 /* .line 5 */
				 android.util.Log .i ( v2,p1 );
				 /* .line 6 */
				 (( android.app.Service ) p0 ).getApplication ( ); // invoke-virtual {p0}, Landroid/app/Service;->getApplication()Landroid/app/Application;
				 /* check-cast p1, Lcom/orange/hce/proto/PackIdApp; */
				 (( com.orange.hce.proto.PackIdApp ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/orange/hce/proto/PackIdApp;->a()Lcom/orange/business/packid/android/lib/PackId;
				 int v0 = 0; // const/4 v0, 0x0
				 v1 = this.h;
				 final String v2 = "token"; // const-string v2, "token"
				 final String v3 = ""; // const-string v3, ""
				 (( com.orange.business.packid.android.lib.PackId ) p1 ).update ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lcom/orange/business/packid/android/lib/PackId;->update(ZLjava/lang/String;)V
				 /* .line 7 */
			 } // :cond_0
			 (( e.f.c.u.b0 ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/u/b0;->a()Ljava/util/Map;
			 final String v1 = "subscribe"; // const-string v1, "subscribe"
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 8 */
				 (( e.f.c.u.b0 ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/u/b0;->a()Ljava/util/Map;
				 /* check-cast p1, Ljava/lang/String; */
				 /* .line 9 */
				 /* new-instance v0, Ljava/lang/StringBuilder; */
				 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
				 final String v1 = "Subscribe to topic "; // const-string v1, "Subscribe to topic "
				 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 android.util.Log .i ( v2,v0 );
				 /* .line 10 */
				 com.google.firebase.messaging.FirebaseMessaging .c ( );
				 (( com.google.firebase.messaging.FirebaseMessaging ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->a(Ljava/lang/String;)Le/f/a/b/h/g;
				 /* .line 11 */
			 } // :cond_1
			 (( e.f.c.u.b0 ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/u/b0;->a()Ljava/util/Map;
			 final String v1 = "unsubscribe"; // const-string v1, "unsubscribe"
			 if ( v0 != null) { // if-eqz v0, :cond_2
				 /* .line 12 */
				 (( e.f.c.u.b0 ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/u/b0;->a()Ljava/util/Map;
				 /* check-cast p1, Ljava/lang/String; */
				 /* .line 13 */
				 /* new-instance v0, Ljava/lang/StringBuilder; */
				 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
				 final String v1 = "Unsubscribe to topic "; // const-string v1, "Unsubscribe to topic "
				 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 android.util.Log .i ( v2,v0 );
				 /* .line 14 */
				 com.google.firebase.messaging.FirebaseMessaging .c ( );
				 (( com.google.firebase.messaging.FirebaseMessaging ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->b(Ljava/lang/String;)Le/f/a/b/h/g;
			 } // :cond_2
			 final String p1 = "An empty message has been receive"; // const-string p1, "An empty message has been receive"
			 /* .line 15 */
			 android.util.Log .i ( v2,p1 );
		 } // :cond_3
	 } // :goto_0
	 return;
} // .end method
public void c ( java.lang.String p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* invoke-super {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->c(Ljava/lang/String;)V */
	 /* .line 2 */
	 v0 = this.h;
	 final String v1 = "token"; // const-string v1, "token"
	 /* .line 3 */
	 (( android.app.Service ) p0 ).getApplication ( ); // invoke-virtual {p0}, Landroid/app/Service;->getApplication()Landroid/app/Application;
	 /* check-cast v0, Lcom/orange/hce/proto/PackIdApp; */
	 (( com.orange.hce.proto.PackIdApp ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/orange/hce/proto/PackIdApp;->a()Lcom/orange/business/packid/android/lib/PackId;
	 int v1 = 0; // const/4 v1, 0x0
	 (( com.orange.business.packid.android.lib.PackId ) v0 ).update ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Lcom/orange/business/packid/android/lib/PackId;->update(ZLjava/lang/String;)V
	 final String v0 = "FirebaseService"; // const-string v0, "FirebaseService"
	 /* .line 4 */
	 android.util.Log .i ( v0,p1 );
	 return;
} // .end method
public void onCreate ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* invoke-super {p0}, Landroid/app/Service;->onCreate()V */
	 final String v0 = "PackIdLibFirebaseMessagingService"; // const-string v0, "PackIdLibFirebaseMessagingService"
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 2 */
	 (( android.app.Service ) p0 ).getSharedPreferences ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/app/Service;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
	 this.h = v0;
	 return;
} // .end method

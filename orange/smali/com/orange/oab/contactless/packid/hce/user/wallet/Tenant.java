public class com.orange.oab.contactless.packid.hce.user.wallet.Tenant implements java.io.Serializable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public java.lang.String b;
	 public java.lang.String c;
	 public Boolean d;
	 public Boolean e;
	 /* # direct methods */
	 public com.orange.oab.contactless.packid.hce.user.wallet.Tenant ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->d:Z */
		 /* .line 3 */
		 /* iput-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->e:Z */
		 return;
	 } // .end method
	 public com.orange.oab.contactless.packid.hce.user.wallet.Tenant ( ) {
		 /* .locals 1 */
		 /* .line 4 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 5 */
		 /* iput-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->d:Z */
		 /* .line 6 */
		 /* iput-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->e:Z */
		 /* .line 7 */
		 this.b = p1;
		 return;
	 } // .end method
	 public static com.orange.oab.contactless.packid.hce.user.wallet.Tenant defaultTenant ( android.content.Context p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant; */
		 /* invoke-direct {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;-><init>()V */
		 /* .line 2 */
		 (( android.content.Context ) p0 ).getString ( v1 ); // invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) v0 ).setName ( p0 ); // invoke-virtual {v0, p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->setName(Ljava/lang/String;)V
		 int p0 = 1; // const/4 p0, 0x1
		 /* .line 3 */
		 /* iput-boolean p0, v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->e:Z */
	 } // .end method
	 /* # virtual methods */
	 public Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 2 */
		 /* if-ne p0, p1, :cond_0 */
		 int p1 = 1; // const/4 p1, 0x1
	 } // :cond_0
	 if ( p1 != null) { // if-eqz p1, :cond_2
		 /* .line 1 */
		 (( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 /* const-class v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant; */
		 /* if-eq v1, v0, :cond_1 */
		 /* .line 2 */
	 } // :cond_1
	 /* check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant; */
	 /* .line 3 */
	 v0 = this.b;
	 p1 = this.b;
	 p1 = 	 java.util.Objects .equals ( v0,p1 );
} // :cond_2
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.lang.String getLogoUrl ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public java.lang.String getName ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public Integer hashCode ( ) {
/* .locals 3 */
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [Ljava/lang/Object; */
/* .line 1 */
v1 = this.b;
int v2 = 0; // const/4 v2, 0x0
/* aput-object v1, v0, v2 */
v1 = this.c;
int v2 = 1; // const/4 v2, 0x1
/* aput-object v1, v0, v2 */
v0 = java.util.Objects .hash ( v0 );
} // .end method
public Boolean isDefault ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->e:Z */
} // .end method
public void setLogoUrl ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.c = p1;
return;
} // .end method
public void setName ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
return;
} // .end method
public void setShouldSendEnrollmentNotification ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->d:Z */
return;
} // .end method
public Boolean shouldSendEnrollmentNotification ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->d:Z */
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Tenant{name=\'"; // const-string v1, "Tenant{name=\'"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.b;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v1, 0x27 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
final String v2 = ", logoUrl=\'"; // const-string v2, ", logoUrl=\'"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.c;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* const/16 v1, 0x7d */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method

public class com.orange.business.packid.android.lib.PackIdPreferences {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Integer FORCE_CONNECTION_TIMEOUT_IN_SECONDS;
	 public static final com.orange.business.packid.android.lib.PackIdPreferences INSTANCE;
	 /* # instance fields */
	 public Boolean a;
	 public Boolean b;
	 public Boolean c;
	 public Boolean d;
	 public Boolean e;
	 /* # direct methods */
	 public static com.orange.business.packid.android.lib.PackIdPreferences ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Lcom/orange/business/packid/android/lib/PackIdPreferences; */
		 /* invoke-direct {v0}, Lcom/orange/business/packid/android/lib/PackIdPreferences;-><init>()V */
		 return;
	 } // .end method
	 public com.orange.business.packid.android.lib.PackIdPreferences ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->a:Z */
		 /* .line 3 */
		 /* iput-boolean v0, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->b:Z */
		 int v1 = 1; // const/4 v1, 0x1
		 /* .line 4 */
		 /* iput-boolean v1, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->c:Z */
		 /* .line 5 */
		 /* iput-boolean v0, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->d:Z */
		 /* .line 6 */
		 /* iput-boolean v0, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->e:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void acceptHttp ( Boolean p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* iput-boolean p1, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->a:Z */
		 return;
	 } // .end method
	 public Boolean isBleEnabled ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget-boolean v0, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->d:Z */
	 } // .end method
	 public Boolean isHttpAccepted ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget-boolean v0, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->a:Z */
	 } // .end method
	 public Boolean isNfcEnabled ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget-boolean v0, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->e:Z */
	 } // .end method
	 public Boolean isRssiBroadcastEnabled ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget-boolean v0, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->b:Z */
	 } // .end method
	 public Boolean isRssiLevelBroadcastEnabled ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget-boolean v0, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->c:Z */
	 } // .end method
	 public void setBleEnabled ( Boolean p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* iput-boolean p1, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->d:Z */
		 return;
	 } // .end method
	 public void setEnableRssiBroadcast ( Boolean p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* iput-boolean p1, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->b:Z */
		 return;
	 } // .end method
	 public void setEnableRssiLevelBroadcast ( Boolean p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* iput-boolean p1, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->c:Z */
		 return;
	 } // .end method
	 public void setNfcEnabled ( Boolean p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* iput-boolean p1, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->e:Z */
		 return;
	 } // .end method

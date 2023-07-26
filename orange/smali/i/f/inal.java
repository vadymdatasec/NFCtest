public class inal implements java.util.ListIterator implements i.h.c.q.a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final i.f.p b;
	 /* # direct methods */
	 public static inal ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Li/f/p; */
		 /* invoke-direct {v0}, Li/f/p;-><init>()V */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void add ( java.lang.Object p0 ) { //synthethic
		 /* .locals 1 */
		 /* new-instance p1, Ljava/lang/UnsupportedOperationException; */
		 final String v0 = "Operation is not supported for read-only collection"; // const-string v0, "Operation is not supported for read-only collection"
		 /* invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
	 } // .end method
	 public Boolean hasNext ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public Boolean hasPrevious ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public java.lang.Object next ( ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .line 1 */
		 (( i.f.p ) p0 ).next ( ); // invoke-virtual {p0}, Li/f/p;->next()Ljava/lang/Void;
		 int v0 = 0; // const/4 v0, 0x0
		 /* throw v0 */
	 } // .end method
	 public java.lang.Void next ( ) {
		 /* .locals 1 */
		 /* .line 2 */
		 /* new-instance v0, Ljava/util/NoSuchElementException; */
		 /* invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V */
		 /* throw v0 */
	 } // .end method
	 public Integer nextIndex ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public java.lang.Object previous ( ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .line 1 */
		 (( i.f.p ) p0 ).previous ( ); // invoke-virtual {p0}, Li/f/p;->previous()Ljava/lang/Void;
		 int v0 = 0; // const/4 v0, 0x0
		 /* throw v0 */
	 } // .end method
	 public java.lang.Void previous ( ) {
		 /* .locals 1 */
		 /* .line 2 */
		 /* new-instance v0, Ljava/util/NoSuchElementException; */
		 /* invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V */
		 /* throw v0 */
	 } // .end method
	 public Integer previousIndex ( ) {
		 /* .locals 1 */
		 int v0 = -1; // const/4 v0, -0x1
	 } // .end method
	 public void remove ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Ljava/lang/UnsupportedOperationException; */
		 final String v1 = "Operation is not supported for read-only collection"; // const-string v1, "Operation is not supported for read-only collection"
		 /* invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // .end method
	 public void set ( java.lang.Object p0 ) { //synthethic
		 /* .locals 1 */
		 /* new-instance p1, Ljava/lang/UnsupportedOperationException; */
		 final String v0 = "Operation is not supported for read-only collection"; // const-string v0, "Operation is not supported for read-only collection"
		 /* invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
	 } // .end method

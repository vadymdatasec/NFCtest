.class public final Le/h/b/a/p/j;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Le/h/b/a/p/c;

.field public b:Ljava/lang/String;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Le/h/b/a/p/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p1, p0, Le/h/b/a/p/j;->a:Le/h/b/a/p/c;

    const-string p1, "FetchVersion"

    .line 2
    iput-object p1, p0, Le/h/b/a/p/j;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public varargs a([Ljava/lang/Void;)Ljava/lang/String;
    .locals 2

    const-string v0, "params"

    invoke-static {p1, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string p1, "https://play.google.com/store/apps/details?id=com.orange.oab.packid.ble&hl=en"

    .line 1
    invoke-static {p1}, Lm/b/g;->a(Ljava/lang/String;)Lm/b/f;

    move-result-object p1

    const/16 v0, 0xfa0

    .line 2
    invoke-interface {p1, v0}, Lm/b/f;->a(I)Lm/b/f;

    const-string v0, "Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6"

    .line 3
    invoke-interface {p1, v0}, Lm/b/f;->b(Ljava/lang/String;)Lm/b/f;

    const-string v0, "http://www.google.com"

    .line 4
    invoke-interface {p1, v0}, Lm/b/f;->a(Ljava/lang/String;)Lm/b/f;

    .line 5
    invoke-interface {p1}, Lm/b/f;->get()Lm/b/i/i;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v0, "Current Version"

    .line 6
    invoke-virtual {p1, v0}, Lm/b/i/l;->e(Ljava/lang/String;)Lm/b/k/f;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm/b/i/l;

    .line 8
    invoke-virtual {v0}, Lm/b/i/l;->A()Lm/b/k/f;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 9
    invoke-virtual {v0}, Lm/b/i/l;->A()Lm/b/k/f;

    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/b/i/l;

    .line 11
    invoke-virtual {v1}, Lm/b/i/l;->D()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Le/h/b/a/p/j;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 12
    :cond_1
    iget-object p1, p0, Le/h/b/a/p/j;->b:Ljava/lang/String;

    return-object p1

    .line 13
    :catchall_0
    iget-object p1, p0, Le/h/b/a/p/j;->c:Ljava/lang/String;

    const-string v0, "Fetch failed"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 14
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 15
    iget-object v0, p0, Le/h/b/a/p/j;->a:Le/h/b/a/p/c;

    .line 16
    invoke-static {v0}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Le/h/b/a/p/c;->a(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Le/h/b/a/p/j;->a([Ljava/lang/Void;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Le/h/b/a/p/j;->a(Ljava/lang/String;)V

    return-void
.end method

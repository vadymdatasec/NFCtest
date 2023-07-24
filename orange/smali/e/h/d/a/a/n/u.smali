.class public abstract Le/h/d/a/a/n/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)V
    .locals 3

    const-string v0, "packid.UserClean"

    const-string v1, "Delete all data"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {p0}, Le/h/d/a/a/s/m;->c(Landroid/content/Context;)Le/h/d/a/a/s/g0;

    move-result-object v0

    invoke-virtual {v0}, Le/h/d/a/a/s/g0;->b()V

    .line 3
    invoke-static {p0}, Le/h/d/a/a/n/w/c;->a(Landroid/content/Context;)V

    .line 4
    invoke-static {p0}, Lcom/orange/oab/contactless/packid/service/Aid;->register(Landroid/content/Context;)V

    const/4 v0, 0x0

    const-string v1, "========="

    .line 5
    invoke-static {p0, v1, v0}, Lcom/orange/oab/contactless/packid/service/LogManager;->writeToPersistentLog(Landroid/content/Context;Ljava/lang/String;Z)V

    const-string v2, "Clear All Users"

    .line 6
    invoke-static {p0, v2}, Lcom/orange/oab/contactless/packid/service/LogManager;->writeToPersistentLog(Landroid/content/Context;Ljava/lang/String;)V

    .line 7
    invoke-static {p0, v1, v0}, Lcom/orange/oab/contactless/packid/service/LogManager;->writeToPersistentLog(Landroid/content/Context;Ljava/lang/String;Z)V

    return-void
.end method

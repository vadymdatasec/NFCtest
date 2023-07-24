.class public final Le/b/a/y/x/g1/l;
.super Le/b/a/y/x/g1/i;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const-string v0, "image_manager_disk_cache"

    const-wide/32 v1, 0xfa00000

    .line 1
    invoke-direct {p0, p1, v0, v1, v2}, Le/b/a/y/x/g1/l;-><init>(Landroid/content/Context;Ljava/lang/String;J)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;J)V
    .locals 1

    .line 2
    new-instance v0, Le/b/a/y/x/g1/k;

    invoke-direct {v0, p1, p2}, Le/b/a/y/x/g1/k;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-direct {p0, v0, p3, p4}, Le/b/a/y/x/g1/i;-><init>(Le/b/a/y/x/g1/h;J)V

    return-void
.end method

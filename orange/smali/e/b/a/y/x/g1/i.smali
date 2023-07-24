.class public abstract Le/b/a/y/x/g1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/x/g1/a;


# instance fields
.field public final a:J

.field public final b:Le/b/a/y/x/g1/h;


# direct methods
.method public constructor <init>(Le/b/a/y/x/g1/h;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p2, p0, Le/b/a/y/x/g1/i;->a:J

    .line 3
    iput-object p1, p0, Le/b/a/y/x/g1/i;->b:Le/b/a/y/x/g1/h;

    return-void
.end method


# virtual methods
.method public a()Le/b/a/y/x/g1/c;
    .locals 3

    .line 1
    iget-object v0, p0, Le/b/a/y/x/g1/i;->b:Le/b/a/y/x/g1/h;

    invoke-interface {v0}, Le/b/a/y/x/g1/h;->a()Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    return-object v1

    .line 3
    :cond_2
    :goto_0
    iget-wide v1, p0, Le/b/a/y/x/g1/i;->a:J

    invoke-static {v0, v1, v2}, Le/b/a/y/x/g1/j;->a(Ljava/io/File;J)Le/b/a/y/x/g1/c;

    move-result-object v0

    return-object v0
.end method

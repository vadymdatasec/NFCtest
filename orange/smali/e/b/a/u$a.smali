.class public Le/b/a/u$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/z/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/b/a/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final a:Le/b/a/z/x;

.field public final synthetic b:Le/b/a/u;


# direct methods
.method public constructor <init>(Le/b/a/u;Le/b/a/z/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/u$a;->b:Le/b/a/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Le/b/a/u$a;->a:Le/b/a/z/x;

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Le/b/a/u$a;->b:Le/b/a/u;

    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p0, Le/b/a/u$a;->a:Le/b/a/z/x;

    invoke-virtual {v0}, Le/b/a/z/x;->d()V

    .line 3
    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

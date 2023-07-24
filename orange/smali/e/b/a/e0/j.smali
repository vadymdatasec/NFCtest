.class public Le/b/a/e0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/e0/k;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/e0/k<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public volatile a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final synthetic b:Le/b/a/e0/k;


# direct methods
.method public constructor <init>(Le/b/a/e0/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/e0/j;->b:Le/b/a/e0/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/e0/j;->a:Ljava/lang/Object;

    if-nez v0, :cond_1

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    iget-object v0, p0, Le/b/a/e0/j;->a:Ljava/lang/Object;

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Le/b/a/e0/j;->b:Le/b/a/e0/k;

    invoke-interface {v0}, Le/b/a/e0/k;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Le/b/a/e0/j;->a:Ljava/lang/Object;

    .line 5
    :cond_0
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 6
    :cond_1
    :goto_0
    iget-object v0, p0, Le/b/a/e0/j;->a:Ljava/lang/Object;

    return-object v0
.end method

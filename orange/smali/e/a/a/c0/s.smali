.class public abstract Le/a/a/c0/s;
.super Le/a/a/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/a/a/p<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final r:Ljava/lang/Object;

.field public s:Le/a/a/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/a/a/u<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/lang/String;Le/a/a/u;Le/a/a/t;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Le/a/a/u<",
            "Ljava/lang/String;",
            ">;",
            "Le/a/a/t;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p4}, Le/a/a/p;-><init>(ILjava/lang/String;Le/a/a/t;)V

    .line 2
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/a/a/c0/s;->r:Ljava/lang/Object;

    .line 3
    iput-object p3, p0, Le/a/a/c0/s;->s:Le/a/a/u;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Le/a/a/c0/s;->d(Ljava/lang/String;)V

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le/a/a/c0/s;->r:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/a/a/c0/s;->s:Le/a/a/u;

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 4
    invoke-interface {v1, p1}, Le/a/a/u;->a(Ljava/lang/Object;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 5
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.class public Lc/h/k/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/h/m/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/h/m/a<",
        "Lc/h/k/l;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/h/k/k;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/h/k/l;)V
    .locals 4

    .line 2
    sget-object v0, Lc/h/k/m;->c:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lc/h/k/m;->d:Lc/e/i;

    iget-object v2, p0, Lc/h/k/k;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    if-nez v1, :cond_0

    .line 4
    monitor-exit v0

    return-void

    .line 5
    :cond_0
    sget-object v2, Lc/h/k/m;->d:Lc/e/i;

    iget-object v3, p0, Lc/h/k/k;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lc/e/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    .line 7
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 8
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/h/m/a;

    invoke-interface {v2, p1}, Lc/h/m/a;->a(Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 9
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lc/h/k/l;

    invoke-virtual {p0, p1}, Lc/h/k/k;->a(Lc/h/k/l;)V

    return-void
.end method

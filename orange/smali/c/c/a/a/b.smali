.class public final Lc/c/a/a/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    invoke-static {}, Lc/c/a/a/c;->b()Lc/c/a/a/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/c/a/a/c;->a(Ljava/lang/Runnable;)V

    return-void
.end method

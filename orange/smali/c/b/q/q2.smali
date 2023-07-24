.class public Lc/b/q/q2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/b/q/s2;


# direct methods
.method public constructor <init>(Lc/b/q/s2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/q/q2;->b:Lc/b/q/s2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/q/q2;->b:Lc/b/q/s2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lc/b/q/s2;->a(Z)V

    return-void
.end method

.class public Lc/b/q/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/b/q/p1;


# direct methods
.method public constructor <init>(Lc/b/q/p1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/q/k1;->b:Lc/b/q/p1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/k1;->b:Lc/b/q/p1;

    invoke-virtual {v0}, Lc/b/q/p1;->i()V

    return-void
.end method

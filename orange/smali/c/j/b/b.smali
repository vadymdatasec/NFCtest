.class public Lc/j/b/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/j/b/c;


# direct methods
.method public constructor <init>(Lc/j/b/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/j/b/b;->b:Lc/j/b/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/j/b/b;->b:Lc/j/b/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lc/j/b/c;->e(I)V

    return-void
.end method

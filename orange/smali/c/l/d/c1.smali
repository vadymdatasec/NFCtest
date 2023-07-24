.class public Lc/l/d/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/l/d/o1;


# direct methods
.method public constructor <init>(Lc/l/d/o1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/l/d/c1;->b:Lc/l/d/o1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/l/d/c1;->b:Lc/l/d/o1;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lc/l/d/o1;->d(Z)Z

    return-void
.end method

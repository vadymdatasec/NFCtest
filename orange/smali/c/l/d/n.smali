.class public Lc/l/d/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/l/d/q;


# direct methods
.method public constructor <init>(Lc/l/d/r;Lc/l/d/q;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lc/l/d/n;->b:Lc/l/d/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/n;->b:Lc/l/d/q;

    invoke-virtual {v0}, Lc/l/d/p;->a()V

    return-void
.end method

.class public Lc/h/k/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/h/k/p;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(Lc/h/k/c;Lc/h/k/p;I)V
    .locals 0

    .line 1
    iput-object p2, p0, Lc/h/k/b;->b:Lc/h/k/p;

    iput p3, p0, Lc/h/k/b;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/h/k/b;->b:Lc/h/k/p;

    iget v1, p0, Lc/h/k/b;->c:I

    invoke-virtual {v0, v1}, Lc/h/k/p;->a(I)V

    return-void
.end method

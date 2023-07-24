.class public Lc/h/e/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/h/e/j;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc/h/e/j;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/h/e/g;->b:Lc/h/e/j;

    iput-object p2, p0, Lc/h/e/g;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/h/e/g;->b:Lc/h/e/j;

    iget-object v1, p0, Lc/h/e/g;->c:Ljava/lang/Object;

    iput-object v1, v0, Lc/h/e/j;->b:Ljava/lang/Object;

    return-void
.end method

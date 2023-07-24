.class public Le/f/c/l/e/m/l1;
.super Le/f/c/l/e/m/d;
.source "SourceFile"


# instance fields
.field public final synthetic b:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Le/f/c/l/e/m/m1;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p2, p0, Le/f/c/l/e/m/l1;->b:Ljava/lang/Runnable;

    invoke-direct {p0}, Le/f/c/l/e/m/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/m/l1;->b:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

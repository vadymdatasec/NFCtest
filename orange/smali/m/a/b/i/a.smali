.class public Lm/a/b/i/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/reflect/Method;

.field public b:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lm/a/b/i/a;->a:Ljava/lang/reflect/Method;

    .line 3
    iput-object p2, p0, Lm/a/b/i/a;->b:Ljava/lang/reflect/Method;

    return-void
.end method

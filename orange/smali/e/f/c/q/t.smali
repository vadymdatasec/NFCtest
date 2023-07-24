.class public final synthetic Le/f/c/q/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/k/k;


# static fields
.field public static final a:Le/f/c/k/k;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/f/c/q/t;

    invoke-direct {v0}, Le/f/c/q/t;-><init>()V

    sput-object v0, Le/f/c/q/t;->a:Le/f/c/k/k;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Le/f/c/k/f;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/iid/Registrar;->lambda$getComponents$1$Registrar(Le/f/c/k/f;)Le/f/c/q/i0/a;

    move-result-object p1

    return-object p1
.end method

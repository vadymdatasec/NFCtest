.class public final synthetic Le/f/c/m/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/k/k;


# static fields
.field public static final a:Le/f/c/m/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/f/c/m/a;

    invoke-direct {v0}, Le/f/c/m/a;-><init>()V

    sput-object v0, Le/f/c/m/a;->a:Le/f/c/m/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Le/f/c/k/k;
    .locals 1

    sget-object v0, Le/f/c/m/a;->a:Le/f/c/m/a;

    return-object v0
.end method


# virtual methods
.method public a(Le/f/c/k/f;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$0(Le/f/c/k/f;)Le/f/a/a/g;

    move-result-object p1

    return-object p1
.end method

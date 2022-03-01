package java.cn.mimudanyi;

//宠物商店。
public class PetShop {
    private ILink<IPet> allPets = new LinkImpl<IPet>(); // 保存多个宠物信息。

    // 追加宠物，商品上架。
    public void add(IPet ipet) {
        this.allPets.add(ipet);
    };

    // 删除宠物。
    public void delete(IPet ipet) {
        this.allPets.remove(ipet);
    }

    public ILink<IPet> search(String keyword) {
        ILink<IPet> searchResult = new LinkImpl<IPet>(); // 保存查询结果。
        Object[] result = this.allPets.toArray(); // 获取全部数据。
        if (result != null) {
            for (Object object : result) {
                IPet ipet = (IPet) object;
                if (ipet.getName().contains(keyword) || ipet.getColor().contains(keyword)) {
                    searchResult.add(ipet); // 保存查询结果。
                }
            }
        }
        return searchResult;
    }
}

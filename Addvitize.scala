package AdvitizingProgramUsingScala

case class Campaign(id: String) // 1, 2, 3, 4, 5
case class Platform(id: String) // FACEBOOK, TWITTER, etc.
case class Stat(views: Int, platform: Platform) // views: 500, platform: FACEBOOK

object Addvitize {
  def getCampaigns(): List[Campaign] = ???
  def getStats(campaign: Campaign): List[Stat] = ???
  
  def getStatsForCampaignsMap(): Map[Campaign, List[Stat]] = {
       var camlist : List[Campaign] =getCampaigns()
       //var statlist : List[Stat]=getStats(camlist)
       
       var map : Map[Campaign,List[Stat]]= Map()
       
       for
       {
          
           sta <-getStats(camlist)
            
           for(cam <- 0 to camlist.length)
           {
            map+=map.(cam ->getStats(cam))
           }
          
           
       }yield map
       
     //(for (campaign <- getCampaigns()) yield campaign -> getStats(campaign)).toMap  
    }

    // 2.
    def getTotalViewsPerCampaign(): Map[Campaign, Int] = {
    
      (for (campaign <- getCampaigns())
       for (v<- getStats(campaign())
          var sumview += v.leftShift(_+_.view) 
       yield 
       
       campaign -> sumview .
      
      ).toMap
      
    ap
    
    
    val totalsList = for (campaign <- getCampaigns) yield {
      val stats = getStats(campaign)
      campaign -> stats.foldLeft(0)(_ + _.views)
    }
    totalsList.toMap    
    }

    // 3.
    def getTotalViewsPerPlatformPerCampaign(): Map[Platform, Map[Campaign, Int]] = {
      ???
    }
}